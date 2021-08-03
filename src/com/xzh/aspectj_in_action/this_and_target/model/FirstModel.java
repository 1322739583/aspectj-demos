package com.xzh.aspectj_in_action.this_and_target.model;

public class FirstModel {
    public void foo(int number,String name) {
        System.out.println("Inside MyClass.foo (int,String)");
        bar();
        SecondModel secondModel=new SecondModel();
        secondModel.methodInSecond();
    }

    public void bar(){

    }
}
