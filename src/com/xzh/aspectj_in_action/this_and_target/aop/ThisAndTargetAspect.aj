package com.xzh.aspectj_in_action.this_and_target.aop;

import com.xzh.aspectj_in_action.this_and_target.model.FirstModel;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public aspect ThisAndTargetAspect {
    //这种写法只少了两次对构造器的调用
    @Pointcut("cflow(call(* com.xzh.aspectj_in_action.this_and_target.model.FirstModel.*(..)))&&!within(ThisAndTargetAspect)&&this(com.xzh.aspectj_in_action.this_and_target.model.FirstModel)")
    public void cutThis(){

    }

    @Pointcut("this(model)")
    public void cutThis2(FirstModel model){

    }


    @Pointcut("this(com.xzh.aspectj_in_action.this_and_target.model.FirstModel)")
    public void cutThisAnsy(){

    }
    // pointcut thisMyClassPointCut(FirstModel modele):target(model);

//    @Before("cutThis2(FirstModel )")
//    public void proceed(FirstModel firstModel,JoinPoint joinPoint) {
//        System.out.println(firstModel);
//        System.out.println("this ref:"+joinPoint.getThis());
//        System.out.println(joinPoint);
//        System.out.println("........");
//       // System.out.println("this:"+thisJoinPoint.getThis());
//       // System.out.println("Signature:"+thisJoinPoint.getSignature());
//        //System.out.println("SourceLocation:"+thisJoinPoint.getSourceLocation());
//    }

//    @Before("cutThis()")
//    public void proceed2(JoinPoint joinPoint) {
//        System.out.println("this ref:"+joinPoint.getThis());
//        System.out.println(joinPoint);
//        System.out.println("........");
//        // System.out.println("this:"+thisJoinPoint.getThis());
//        // System.out.println("Signature:"+thisJoinPoint.getSignature());
//        //System.out.println("SourceLocation:"+thisJoinPoint.getSourceLocation());
//    }


}
