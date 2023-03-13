package com.xh._第三部分;

public class SetterAndGetterTest {
    public static void main(String[] args) {
        SetterAndGetter sad = new SetterAndGetter();
        sad.setName("张三");
        sad.setAge(-10);
        System.out.println(sad.getName());
        System.out.println(sad.getAge());
        sad.show();
    }
}
