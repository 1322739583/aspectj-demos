package com.xzh.aspectj_in_action.within.model;

public class SecondModel {
    public void methodInSecond(){
         System.out.println("finish in SecondModel");
         ThirdModel thirdModel=new ThirdModel();
         thirdModel.methodInThird();

    }
}
