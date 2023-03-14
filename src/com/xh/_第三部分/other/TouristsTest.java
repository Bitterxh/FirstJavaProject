package com.xh._第三部分.other;

import java.util.Scanner;

public class TouristsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请输入你的姓名：");
            String name = scanner.next();
            if ("n".equals(name)) {break;};
            System.out.print("请输入你的年龄：");
            int age = scanner.nextInt();
            Tourists tourists = new Tourists();
            tourists.name = name;
            tourists.age = age;
            tourists.show();
        }
        System.out.println("退出程序！");
    }
}
