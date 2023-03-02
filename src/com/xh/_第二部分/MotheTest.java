package com.xh._第二部分;

import java.util.Scanner;

public class MotheTest {
    public static void main(String[] args){
        //调用方法
        m();
        System.out.println("请输入两个整数：");
        Scanner a = new Scanner(System.in);
        int j = a.nextInt();
        int k = a.nextInt();
        //调用外部类的方法
        A.n(j,k);

    }
    static void m(){
        System.out.println("大傻逼");
    }

}
class A{
    public static void n(int x,int y){
        int z = x + y;
        System.out.println("x+y="+z);
    }
}
