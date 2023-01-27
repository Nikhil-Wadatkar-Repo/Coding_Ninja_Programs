package com.bs;

import java.util.Scanner;

public class TotalSalaryQuestions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int basicSalary = s.nextInt();
        char grade = s.next().charAt(0);
        System.out.println(basicSalary + " " + grade);

//        int rr= (int) (hh-((20*hh)/100.0));

//        double hra =  (basicSalary-(basicSalary-((20* basicSalary) / 100.0)));
        double hra=0.2*basicSalary;
//        double da = (int) (basicSalary-(basicSalary-((50* basicSalary) / 100.0)));
        double da=0.5*basicSalary;
//        double pf = (int) (basicSalary-(basicSalary-((11* basicSalary) / 100.0)));
        double pf = 0.11*basicSalary;
        int allow = 0;
        if (grade == 'A')
            allow = 1700;
        else if (grade == 'B')
            allow = 1500;
        else if (grade == 'C')
            allow = 1300;
        else
            allow = 1300;


        double totalSalary = basicSalary + hra + da + allow - pf;
        System.out.println(Math.round(totalSalary));

//        hra =  20% of Rs. 4567 = Rs. 913.4



    }
}


