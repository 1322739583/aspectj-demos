package com.xzh.aspectj_in_action.args.model;

public class TestArgs {
    public static void main(String[] args) {
        XiaoMing xiaoMing=new XiaoMing();
        xiaoMing.walk(new Frog());
        xiaoMing.walk(new Dog());
        xiaoMing.walk(new Cow());
        XiaoZhang xiaoZhang=new XiaoZhang();
        xiaoZhang.walkWithBookAndDog(new Dog(),new KantBiography());
        xiaoZhang.walkWithBookAndDog(new Dog(),new HegelBiography());
    }
}
