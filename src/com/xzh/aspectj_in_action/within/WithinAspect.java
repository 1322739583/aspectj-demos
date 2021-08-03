package com.xzh.aspectj_in_action.within;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WithinAspect {
    //cflow是无法控制颗粒的，有调用的话会一直调用下去。而用within可以过滤内容,within的最小可能只能是类
    @Pointcut("cflow(call(* com.xzh.aspectj_in_action.within.model.FirstModel.*(..)))&&!within(WithinAspect)&&within(com.xzh.aspectj_in_action.within.model.FirstModel))")
    // @Pointcut("cflow(call(* com.xzh.aspectj_in_action.within.model.FirstModel.*(..)))&&!within(WithinAspect)&&within(com.xzh.aspectj_in_action.within.model.SecondModel)")
    //@Pointcut("cflow(call(* com.xzh.aspectj_in_action.within.model.FirstModel.*(..)))&&!within(WithinAspect)&&within(com.xzh.aspectj_in_action.within.model.ThirdModel)")
    public void withinCut(){

    }

    @Before("withinCut()")
    public void procceed(JoinPoint joinPoint){
        System.out.println(joinPoint);
        System.out.println(".........");
    }
}
