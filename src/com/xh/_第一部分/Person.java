package com.xh._第一部分;

public class Person {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<0||age>120){
            this.age=18;
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
}
