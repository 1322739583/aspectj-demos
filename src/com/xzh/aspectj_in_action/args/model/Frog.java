package com.xzh.aspectj_in_action.args.model;

public class Frog implements Animal{
    @Override
    public String yield() {
        return "gua gua";
    }

    @Override
    public String getName() {
        return "青蛙";
    }
}
