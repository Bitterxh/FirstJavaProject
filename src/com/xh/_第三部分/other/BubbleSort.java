package com.xh._第三部分.other;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 33, 12, 88, -9};
        //双重循环，外循环:n-1，内循环控制比较次数（逐渐减少）
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    //设置一个中间变量，来实现互换，达到冒泡的效果
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
