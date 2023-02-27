package com.xh._第一部分;

public class TestPerson {
    public static void main(String[] args){
        //调用无参构造方法创建对象
        Person p=new Person();
        //调用赋值的方法给年龄属性赋值；
        p.setAge(-200);
        //调用取值的方法获取年龄的值
        System.out.println("年龄："+p.getAge());
    }
}
