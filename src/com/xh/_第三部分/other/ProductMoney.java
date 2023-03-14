package com.xh._第三部分.other;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMoney {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        /*double[] money = new double[n];
        for (int i = 0; i < money.length; i++) {
            System.out.print("请输入第" + (i + 1) + "笔金额:");
            money[i] = scanner.nextDouble();
        }
        */
        double[] money = {1.2, 2.3, 6.7, 8.9, 7.8};
        // 预期结果 =
        Arrays.sort(money);
        System.out.println(Arrays.toString(money));
        System.out.println("序号\t金额");
        double sum = 0.0;
        for (int i = 0; i < money.length; i++) {
            System.out.println((i + 1) + "\t" + money[i]);
            sum += money[i];
        }
        System.out.println("总金额为：" + sum);

    }

}
