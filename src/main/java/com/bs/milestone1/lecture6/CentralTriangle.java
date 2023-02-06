package com.bs.milestone1.lecture6;

import java.util.Scanner;

//4444
//        333
//        22
//        1
public class CentralTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(),i=0;
        for (i = 1; i <= num; i++) //outer loop for number of rows(n)
        {
            for (int j = num - i; j >= 1; j--) //inner loop for spaces
            {
                System.out.print(" "); //print space
            }
            for (int j = 1; j <= (2* i - 1); j++) //inner loop for number of columns
            {

                System.out.print("*"); //print star
            }

            System.out.println(); //ending line after each row
        }

    }
}
