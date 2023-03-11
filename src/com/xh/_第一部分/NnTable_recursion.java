package com.xh._第一部分;

public class NnTable_recursion {
    public static void main(String[] ages){
        cont(9);
    }
    public static void cont(int num){
        if (num==1){
            System.out.println("1x1=1");
        }else {
            //递归调用
            cont(num-1);
            //退出递归调用的条件
            for (int i=1;i<=num;i++){
                System.out.print(i+"x"+num+"="+i*num+"  ");
            }
            System.out.println("");
        }

    }
}

