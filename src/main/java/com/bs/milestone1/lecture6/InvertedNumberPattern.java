package com.bs.milestone1.lecture6;

import java.util.Scanner;

//4444
//        333
//        22
//        1
public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int i, j;
        for (i = 0; i<num; i++)//outer loop for number of rows(n)
        {

            for (j = 0; j < (num-i); j++) //  inner loop for columns
            {

                System.out.print(temp); // print star
            }
            temp = temp - 1;
            System.out.println(); // ending line after each row
        }
    }
}
