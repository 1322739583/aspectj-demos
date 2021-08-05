package com.xzh.aspectj_in_action.args.model;

public class Dog implements Animal{
    @Override
    public String yield() {
        return "wang wang";
    }

    @Override
    public String getName() {
        return "小狗";
    }
}
