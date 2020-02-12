package com.xzh.chapter09;

public aspect WithinMethodRecipe {
	pointcut withinMethodCut():withincode(* com.xzh.MyClass.foo(..));

	before ():withinMethodCut()&&!within(com.xzh.chapter09.WithinMethodRecipe +){
		System.out.println(thisJoinPoint.getKind());
		System.out.println(thisJoinPoint.getSignature());
		System.out.println(thisJoinPoint.getSourceLocation());
	}

}
