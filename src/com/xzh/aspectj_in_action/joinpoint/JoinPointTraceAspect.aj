package com.xzh.aspectj_in_action.joinpoint;

public aspect JoinPointTraceAspect {
    pointcut tracePoint():!within(JoinPointTraceAspect)
            &&!call(*.new())
            &&!execution(*.new(..))
            &&!initialization(*.new(..))
            &&!staticinitialization(*);
//            &&!call(* *(..))
//            &&!get(* *)
//            &&!execution(* *(..))

   //  &&!preinitialization(*.new(..))

    before():tracePoint(){
        System.out.println(thisJoinPoint);
    }
}
