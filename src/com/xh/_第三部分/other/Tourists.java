package com.xh._第三部分.other;

public class Tourists {
    String name;
    int age;
    public  void show(){
        if (age <= 10 || age >= 65){
            System.out.println(name+"的年龄为："+ age +"岁 门票免费");
        }
        else {
            System.out.println(name+"的年龄为："+ age +" 门票20元");
        }
    }
}
