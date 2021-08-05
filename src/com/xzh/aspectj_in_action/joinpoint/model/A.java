package com.xzh.aspectj_in_action.joinpoint.model;

public class A {
    public void methodA(){
         B b=new B();
         b.methodB();
    }
}
