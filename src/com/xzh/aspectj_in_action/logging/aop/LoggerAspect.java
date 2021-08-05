package com.xzh.aspectj_in_action.logging.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
public class LoggerAspect {

//   @Pointcut("execution(* com.xzh.aspectj_in_action.logging.*.*(..))"
//            )
//   public void cut(){}
//
//   private Logger logger=Logger.getLogger("trace");
//
//   @Before("cut()")
//   public void proceed(JoinPoint joinPoint){
//      Signature sig = joinPoint.getSignature();
//      logger.logp(Level.INFO,sig.getDeclaringType().getSimpleName(),sig.getName(),"Entering");
//   }




}
