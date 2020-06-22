package com.company;

import java.util.Scanner;

public class grading {
    static void grading(float grade){
        if(grade > 90){
            System.out.println("A++ is the grade");
        }
        else if(grade > 75 & grade < 90){
            System.out.println("A+ is the grade");
        }
        else if(grade > 60 & grade < 75){
            System.out.println("A is the grade");
        }
        else if(grade > 50 & grade < 60){
            System.out.println("B+ is the grade");
        }
        else if(grade > 45 & grade < 50){
            System.out.println("B is the grade");
        }
        else if(grade > 35 & grade < 45){
            System.out.println("C is the grade");
        }
        else{
            System.out.println("D is the grade");
        }

    }

    public static void main(String[] args){
        System.out.println("Enter the grade: ");
        Scanner inputdata = new Scanner(System.in);
        Float grade = inputdata.nextFloat();
        grading(grade);

    }
}
