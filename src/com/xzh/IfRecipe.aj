package com.xzh;

public aspect IfRecipe {
	private static final long mSalary=10000;
	private static final long mZero=0;

	pointcut ifPointcut():if((thisJoinPoint.getThis() instanceof MyClass)
	&&((MyClass)thisJoinPoint.getThis()).getSalary()<mSalary
	&&((MyClass)thisJoinPoint.getThis()).getSalary()>mZero)
		&&!withincode(* MyClass.get*())&&!execution(* MyClass.get*());

	after():ifPointcut()&&!within(IfRecipe +){
		System.out.println(thisJoinPoint.getKind());
		System.out.println(thisJoinPoint.getThis());
		System.out.println(((MyClass)thisJoinPoint.getThis()).getSalary());
		System.out.println(thisJoinPoint.getSourceLocation());
		//System.out.println(thisJoinPoint.getSignature());
	}
}
