package com.xzh;

public aspect CFlowRecipe {
	pointcut callInitPointCut():call(* com.xzh.MyClass.foo(..));

	pointcut cflowPointCut():cflow(callInitPointCut());

	before():cflowPointCut()&&!within(CFlowRecipe +){
		 System.out.println("Signature:"+thisJoinPoint.getStaticPart().getSignature());
		//System.out.println("Kind:"+thisJoinPoint.getKind());
		//System.out.println("SourceLocation:"+thisJoinPoint.getStaticPart().getSourceLocation());
	}


}
