package com.xh._第三部分.interfaces;
//类可以继承一个类，可以实现多个接口
public class Panda extends Animal implements  Valuable, Protectable {
    @Override
    public void eat() {
        System.out.println("熊猫喜欢吃竹子");
    }

    @Override
    public void hide() {
        System.out.println("熊猫一般藏在山里");
    }

    @Override
    public void getMoney() {
        System.out.println("熊猫很值钱");
    }
}
