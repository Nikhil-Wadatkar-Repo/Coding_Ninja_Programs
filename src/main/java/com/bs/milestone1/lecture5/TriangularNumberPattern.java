package com.bs.milestone1.lecture5;

import java.util.Scanner;

public class TriangularNumberPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }

    }
}
