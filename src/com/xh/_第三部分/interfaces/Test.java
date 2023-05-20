package com.xh._第三部分.interfaces;

/**
 * 接口同样具有多态性
 * 接口可以把很多不相关的东西进行整合
 * 特点：
 *   接口中所有的方法都是抽象方法，都是公开的
 *   接口中所有的变量都是全局静态常量
 */

public class Test {
    public static void main(String[] args) {
        //Valuable g = new Gold();
        //g.getMoney();
        // 后三个都是向上转型
        Panda p = new Panda();
        Animal animal = new Panda();
        Valuable valuable = new Panda();
        Protectable protectable = new Panda();
//        p.eat();
//        p.hide();
//        p.getMoney();

        //在动物的角度来看，熊猫只能吃东西
        animal.eat();
        //在有价值的角度来看，熊猫很值钱
        valuable.getMoney();
        //在受保护的角度来看，熊猫藏起来
        protectable.hide();
    }
}
