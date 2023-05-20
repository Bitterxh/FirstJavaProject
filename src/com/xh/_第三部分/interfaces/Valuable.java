package com.xh._第三部分.interfaces;

/**
 * 接口使用interface声明，已经不再是类了
 * 接口中的方法都是抽象方法，不能有正常方法，可以省略掉abstract
 * 接口中的内容都是公共的，可以省略public
 * 只有接口能继承接口
 * 类只能去实现接口 implements、
 */

public interface Valuable {
    void getMoney();
}
