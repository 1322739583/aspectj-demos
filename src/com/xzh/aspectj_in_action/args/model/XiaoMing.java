package com.xzh.aspectj_in_action.args.model;

public class XiaoMing implements Man{

    @Override
    public void walk(Animal animal) {
        System.out.println("xiaoming带着"+animal.yield()+"叫的"+animal.getName()+"散步");
    }
}
