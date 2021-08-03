package com.xzh.chapter11;

public class SecondModel {
    public void methodInSecond(){
         System.out.println("finish in SecondModel");
         ThirdModel thirdModel=new ThirdModel();
         thirdModel.methodInThird();

    }
}
