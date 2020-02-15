package com.xzh.chapter13;

public aspect AroundAdviceRecipe {
//
//	pointcut callFooPointCut():call(int com.xzh.MyClass.foo());
//
//	pointcut callBarPointCut(int value):call(int com.xzh.MyClass.bar(int))&&args(value);
//
//	pointcut callBazPointCut():call(int com.xzh.MyClass.baz());
//
//	int around():callFooPointCut(){
//		System.out.println(thisJoinPoint.getSignature());
//		System.out.println(thisJoinPoint.getSourceLocation());
//		return proceed();
//	}
//
//	int around(int value):callBarPointCut(value){
//		System.out.println(thisJoinPoint.getSignature());
//		System.out.println(thisJoinPoint.getSourceLocation());
//		return proceed(value);
//	}
//
//	int around():callBazPointCut(){
//		System.out.println(thisJoinPoint.getSignature());
//		System.out.println(thisJoinPoint.getSourceLocation());
//		System.out.println(proceed());
//		return 200;
//	}

}
