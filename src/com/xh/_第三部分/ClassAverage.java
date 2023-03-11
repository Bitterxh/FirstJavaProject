package com.xh._第三部分;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        int group = 3;
        int student = 4;
        for (int i = 1; i <= group; i++){
            System.out.println("第"+ i +"班级的成绩");
            double sum = 0.0;
            for (int j = 1; j<= student; j++){
                System.out.print("  第"+ j + "个学生的成绩:");
                Scanner scanner = new Scanner(System.in);
                int score = scanner.nextInt();
                sum += score;
            }
            System.out.println(" 第"+ i +"班级的成绩的平均成绩为:"+ sum/4);
        }
    }
}
