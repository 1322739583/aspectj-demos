package com.xzh.aspectj_in_action.args;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ArgsAspect {
 //  @Pointcut("call(* *(..))&&args(com.xzh.aspectj_in_action.args.model.Dog,..)")
  // @Pointcut("call(* *(..))&&args(com.xzh.aspectj_in_action.args.model.Dog)")
   // @Pointcut("call(* *(..))&&args(com.xzh.aspectj_in_action.args.model.Frog)")
   //  @Pointcut("call(* *(..))&&args(com.xzh.aspectj_in_action.args.model.Animal)")
//   @Pointcut("call(* *(..))&&args(..,com.xzh.aspectj_in_action.args.model.Book)")
//    public void cutArgs(){
//
//   }

//    @Before("cutArgs()")
//    public void proceed(JoinPoint joinPoint){
//       System.out.println(joinPoint);
//   }
}
