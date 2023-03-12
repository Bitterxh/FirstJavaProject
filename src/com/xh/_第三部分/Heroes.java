package com.xh._第三部分;

public class Heroes {
    String name;
    String name2;
    String system;
    int age;

    public Heroes(String name, String system, int age){
        this.name = name;
        this.system = system;
        this.age = age;
    }
    //构造方法也是方法，也能重载
    //可以让我们创建有不同属性的对象
    public Heroes(String name, String name2,String system, int age){
        //this还可以调用当前类的其他构造方法
        this(name,system,age);
        this.name2 = name2;
    }

    public static void main(String[] args) {
        Heroes lhc = new Heroes("令狐冲", "华山派", 18);
        Heroes ws = new Heroes("武松", "行者","梁山", 18);
    }
}
