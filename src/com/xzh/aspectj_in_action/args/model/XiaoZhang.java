package com.xzh.aspectj_in_action.args.model;

public class XiaoZhang implements Man{

    @Override
    public void walk(Animal animal) {
        System.out.println("xiaozhang带着"+animal.yield()+"叫的"+animal.getName()+"散步");
    }
    public void walkWithBookAndDog(Dog dog,Book book){
        System.out.println("xiaozhang带着"+dog.yield()+"叫的"+dog.getName()+"散步,"+"手里拿着"+book.getName());
    }
}
