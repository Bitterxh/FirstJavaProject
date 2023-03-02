package com.xh._第二部分;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args){
        System.out.println("请输入学生成绩:");
        Scanner x = new Scanner(System.in);
        int y = (int)(x.nextFloat()/10);
        switch (y){
            case 9: case 10:
                System.out.println("等级为A！");break;
            case 8:
                System.out.println("等级为B！");break;
            case 7:
                System.out.println("等级为C！");break;
            case 6:
                System.out.println("等级为D！");break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("等级为E！");break;
        }
    }
}
