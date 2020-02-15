package com.xzh.chapter13;

public aspect AfterReturingAdviceRecipe {
//	pointcut callFooPointCut():call(void com.xzh.MyClass.foo(int,String));
//
//	pointcut callBarPointCut():call(int com.xzh.MyClass.bar(int));
//
//	//无返回值（void）的情况
//	after() returning:callFooPointCut(){
//		System.out.println(thisJoinPoint.getSignature());
//		System.out.println(thisJoinPoint.getSourceLocation());
//	}
//
//	//有返回值的情况
//	after() returning(Object value):callBarPointCut(){
//		System.out.println(value);
//	}
//
//	//有返回值的情况
//	after() returning(int value):callBarPointCut(){
//		System.out.println(value);
//	}
//
//	//有返回值的情况
//	after() returning(double value):callBarPointCut(){
//		System.out.println(value);
//	}
}
