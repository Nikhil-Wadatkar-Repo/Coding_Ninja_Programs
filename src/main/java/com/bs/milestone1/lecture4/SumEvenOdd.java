package com.bs.milestone1.lecture4;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum_even = 0, sum_odd = 0;
         int temp=num;
        while(temp>0){
        int lastDig=temp%10;
        if(lastDig%2==0){
            sum_even=sum_even+lastDig;
        }else{
            sum_odd=sum_odd+lastDig;
        }

        temp=temp/10;
        }

        System.out.println(sum_even+" "+sum_odd);

    }
}
