package com.xzh;

import com.xzh.dao.ProductDao;

public aspect CaptureCallTargetRecipe {
//	pointcut captureCallTarget(ProductDao target):call(* com.xzh.dao.ProductDao.*(..))&&target(target);
//
//	before (ProductDao target):captureCallTarget(target){
//		System.out.println("target"+target);
//	//	System.out.println(target.delete());
//	}


}
