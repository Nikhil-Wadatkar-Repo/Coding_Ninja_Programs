package com.bs.milestone1.lecture5;

//E
//        DE
//        CDE
//        BCDE
//        ABCDE

import java.util.Scanner;

public class InterestingAlphabetsPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        char ch = (char) ('A' + num - 1);
        int i = 0;
        for(i=num;i>=1;i--)
        {
            for( int j=i;j<=num;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println("");
        }
    }
}
