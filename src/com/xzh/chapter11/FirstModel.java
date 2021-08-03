package com.xzh.chapter11;

public class FirstModel {
    public void foo(int number,String name) {
        System.out.println("Inside MyClass.foo (int,String)");
        bar();
        SecondModel secondModel=new SecondModel();
        secondModel.methodInSecond();
    }

    public void bar(){
         System.out.println("method bar");
    }
}
