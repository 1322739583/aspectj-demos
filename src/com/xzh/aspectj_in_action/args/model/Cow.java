package com.xzh.aspectj_in_action.args.model;

public class Cow implements Animal{
    @Override
    public String yield() {
        return "mou mou";
    }

    @Override
    public String getName() {
        return "牛";
    }
}
