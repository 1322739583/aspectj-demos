package com.xzh;

public aspect IfRecipe {
//	private static final long mSalary=10000;
//	//不能直接在表达式里面使用数字，不然报错，所以定义了一个变量来表示
//	private static final long mZero=0;
//
//	pointcut ifPointcut():if((thisJoinPoint.getThis() instanceof MyClass)
//	&&((MyClass)thisJoinPoint.getThis()).getSalary()<mSalary
//	&&((MyClass)thisJoinPoint.getThis()).getSalary()>mZero)
//		&&!withincode(* MyClass.get*())&&!execution(* MyClass.get*());
//
//	after():ifPointcut()&&!within(IfRecipe +){
//		System.out.println(thisJoinPoint.getKind());
//		System.out.println(thisJoinPoint.getThis());
//		System.out.println(((MyClass)thisJoinPoint.getThis()).getSalary());
//		System.out.println(thisJoinPoint.getSourceLocation());
//		//System.out.println(thisJoinPoint.getSignature());
//	}
}
