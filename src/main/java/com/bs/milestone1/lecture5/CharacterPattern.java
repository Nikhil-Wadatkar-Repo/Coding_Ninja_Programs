package com.bs.milestone1.lecture5;

import java.util.Scanner;

//A
//BC
//CDE
//DEFG

public class CharacterPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 0;
        char ch='A';
        while (i < num) {
            int j = 0;
            int k=i;
            while (j <= i) {
                System.out.print((char) ('A' + k));
                j = j + 1;
                k=k+1;
            }
            i = i + 1;
            System.out.println();
        }
    }
}
