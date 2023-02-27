package com.xh._第一部分;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {
    public static void main(String[] args){
        boolean b = true;
        int L = 0;
        for (int i=2;i<=1000;i++){
                for (int j=2;j<i;j++) {
                    if (i % j==0){
                        b=false;
                        break;
                    }
                }
                if (b){
                    System.out.print(i+" ");
                    L++;
                    if(L==8){
                        System.out.println("");
                        L=0;
                    }
                }
                b=true;
            }
    }
}
