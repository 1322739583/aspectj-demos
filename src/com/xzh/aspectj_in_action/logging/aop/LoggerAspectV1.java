package com.xzh.aspectj_in_action.logging.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.logging.Logger;

@Aspect
public class LoggerAspectV1 {

   @Pointcut("execution(* com.xzh.aspectj_in_action.logging.*.*(..))||" +
           "execution(com.xzh.aspectj_in_action.logging.*.new(..))&&!within(LoggerAspectV1)")
   public void cut(){}

   private Logger logger=Logger.getLogger("trace");

   @Before("cut()")
   public void proceed(JoinPoint joinPoint){
      Signature sig = joinPoint.getSignature();

      String methodName=sig.getName();
      if (methodName.equals("<init>")){
         methodName="Constructor";
      }
      //logger.logp(Level.INFO,sig.getDeclaringType().getSimpleName(),sig.getName(),"Entering");
      System.out.println("Entering [" +
              sig.getDeclaringType().getSimpleName() +" "+
              methodName+
              "]");
   }




}
