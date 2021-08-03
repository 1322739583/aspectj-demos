package com.xzh.aspectj_in_action.cflow.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class CflowAspect {
    @Pointcut("call(* com.xzh.aspectj_in_action.cflow.model.B.*(..))")
    public void cutB(){

    }

    @Pointcut("call(* com.xzh.aspectj_in_action.cflow.model.*.*(..))")
    public void cutCall(){

    }

    @Pointcut("execution(* com.xzh.aspectj_in_action.cflow.model.*.*(..))")
    public void cutExecution(){

    }

    @Pointcut("call(* com.xzh.aspectj_in_action.cflow.model.A.methodA(..))")
    public void callA(){

    }


    @Pointcut("cflowbelow(callA())&&!within(CflowAspect)")
    public void cflowMethodA(){

    }

    @Before("cflowMethodA()")
    public void proceed(JoinPoint joinPoint) {
        System.out.println(joinPoint.getKind() + "(" + joinPoint.getSignature() + ")");//等同于输出直接joinPoint
        // System.out.println(joinPoint.getKind());
        // System.out.println(joinPoint.getSourceLocation());
        // System.out.println(joinPoint);
        System.out.println("...............");
    }
}
