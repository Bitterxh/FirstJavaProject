package com.xh._第三部分.other;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array1 = {10, 12, 4, 16, 90, 67};
        int[] array2 = {11, 22, 99, 83, 12, 46};
        //Arrays.equals用来比较两个数组是否相等
        System.out.println(Arrays.equals(array1,array2));
        //Arrays.copyOf用来复制一个数组，并指定复制的长度，被复制的数组长度不够用0补
        int[] array3 = Arrays.copyOf(array1, 7);
        System.out.println(Arrays.toString(array3));
        //Arrays.sort将数组升序排序
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        //进行二分查找某元素之前必须将数组升序排序
        //如果未找到key则将输出被查找数本应该在数组中的下标的负数再-1
        //-1是防止如果被查找数本应该排在第一位置，导致输出0，0是查找到了在第一位
        int pos = Arrays.binarySearch(array1, 18);
        System.out.println("被查找的数的下标为："+pos);
        //将数组中的全部元素换成val
        Arrays.fill(array2,666);
        System.out.println(Arrays.toString(array2));
        //利用for循环将数组逆序输出
        for (int i = array1.length-1; i >= 0 ; i--){
            System.out.print(array1[i] + " ");
        }
    }
}
