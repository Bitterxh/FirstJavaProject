package com.xh._第三部分;

import java.util.Scanner;

public class ChangePassword {
    public static void main(String[] args) {
        BankCard bankCard = new BankCard();
        bankCard.username="张三";
        bankCard.password="111111";
        System.out.print("请输入你的用户名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("请输入你的密码：");
        String password = scanner.next();
        if (name.equals(bankCard.username) && password.equals(bankCard.password)){
            System.out.print("请输入你的新密码：");
            bankCard.password = scanner.next();
            System.out.println("密码修改成功，你的新密码是:" + bankCard.password);
        }
        else {
            System.out.println("账号或密码错误！");
        }
    }
}
