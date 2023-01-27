package com.bs.milestone1.lecture5;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 0;
        while (i < num) {
            int j=0;
            while (j < num) {
                System.out.print(num);
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }
    }
}
