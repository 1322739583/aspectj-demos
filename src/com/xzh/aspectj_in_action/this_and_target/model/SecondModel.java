package com.xzh.aspectj_in_action.this_and_target.model;

public class SecondModel {
    public void methodInSecond(){
         ThirdModel thirdModel=new ThirdModel();
         thirdModel.methodInThird();
    }
}
