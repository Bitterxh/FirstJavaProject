package com.xh._第三部分.other;

public class SetterAndGetter {
    //成员变量是私有的
    private String name;
    private int age;

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //实现对私有变量的操作的同时又能保护成员变量不会被胡乱赋值
    public void setAge(int age) {
        if (age < 0 || age > 150){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    //getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void show(){
        System.out.println("姓名："+this.name+" 年龄："+this.age);
    }
}
