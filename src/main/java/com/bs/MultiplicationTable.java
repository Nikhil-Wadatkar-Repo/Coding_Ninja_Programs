package com.bs;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i=1;
        if(num>=0 && num<=10000){
            while (i<=10){
                System.out.println(num*i);
                i=i+1;
            }
        }
    }
}
