package com.xzh.aspectj_in_action.this_and_target;


import com.xzh.aspectj_in_action.this_and_target.model.FirstModel;

public class TestThisAndTarget {
    public static void main(String[] args) {
        FirstModel modele=new FirstModel();
        modele.foo(1,"name");
    }
}
