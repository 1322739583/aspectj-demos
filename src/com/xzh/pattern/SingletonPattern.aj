package com.xzh.pattern;

import java.util.HashMap;

public aspect SingletonPattern issingleton(){
//	private HashMap singletons=new HashMap();
//
//	public interface Singleton{
//
//	}
//
//	public interface NonSingleton{
//
//	}
//
//	pointcut selectSingletons():call((Singleton +).new(..));
//
//	pointcut excludeSingletons():!call((NonSingleton +).new(..));
//
//	Object around() :selectSingletons()&&excludeSingletons(){
//		Class singleton=thisJoinPoint.getSignature().getDeclaringType();
//		synchronized (singletons){
//			if (singletons.get(singleton)==null){
//				singletons.put(singleton,proceed());
//			}
//		}
//
//		return singletons.get(singleton);
//	}
}
