package com.xh._第三部分.interfaces;

/**
 * 类只支持单继承，接口支持多实现
 */

public class Gold implements Valuable{
    //因为接口中的方法都是抽象方法，所有实现接口之后必须去实现抽象方法
    @Override
    public void getMoney(){
        System.out.println("黄金可以换钱");
    }
}
