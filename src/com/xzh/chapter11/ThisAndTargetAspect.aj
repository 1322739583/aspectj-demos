package com.xzh.chapter11;

public aspect ThisAndTargetAspect {
   // pointcut thisMyClassPointCut(FirstModel modele):target(modele);
    // pointcut thisMyClassPointCut(FirstModel modele):target(model);

   //  pointcut thisMyClassPointCut2():this(FirstModel);
    pointcut thisMyClassPointCut2():target(FirstModel);
//    before(FirstModel model):thisMyClassPointCut(model){
//        System.out.println("this ref:"+model);
//        System.out.println(thisJoinPoint);
//        System.out.println("........");
//       // System.out.println("this:"+thisJoinPoint.getThis());
//       // System.out.println("Signature:"+thisJoinPoint.getSignature());
//        //System.out.println("SourceLocation:"+thisJoinPoint.getSourceLocation());
//    }

    pointcut cflowcut():cflow(call(* FirstModel.*(..)))&&!within(ThisAndTargetAspect)&&target(FirstModel);

//    before():cflowcut(){
//       // System.out.println("this ref:"+thisJoinPoint.getThis());
//        System.out.println(thisJoinPoint);
//        System.out.println("........");
//        // System.out.println("this:"+thisJoinPoint.getThis());
//        // System.out.println("Signature:"+thisJoinPoint.getSignature());
//        //System.out.println("SourceLocation:"+thisJoinPoint.getSourceLocation());
//    }


}
