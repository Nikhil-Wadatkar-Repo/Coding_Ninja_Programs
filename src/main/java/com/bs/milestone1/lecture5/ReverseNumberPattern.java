package com.bs.milestone1.lecture5;

import java.util.Scanner;

public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        while (i <= num) {
            int j=i;
            while (j >=1) {
                System.out.print(j);
                j=j-1;
            }
            i=i+1;
            System.out.println();
        }
    }
}
