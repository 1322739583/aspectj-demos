package com.xzh.aspectj_in_action.within;


import com.xzh.aspectj_in_action.within.model.FirstModel;

public class TestThisAndTarget {
    public static void main(String[] args) {
        FirstModel modele=new FirstModel();
        modele.foo(1,"name");
    }
}
