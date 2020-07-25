package com.company;

import java.util.Scanner;

public class calc {
    public static void main(String args[]){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter in your operator: ");
        String op = input1.nextLine();
        System.out.println("Enter in your first number");
        Float no1 = input1.nextFloat();
        System.out.println("Enter in your second number");
        Float no2 = input1.nextFloat();


        if (op.equals("+")){
            float total = no1 + no2;
            System.out.println("The sum of the numbers are: "+total);
        }
        else if (op.equals("-")){
            float total = no1 - no2;
            System.out.println("The difference of the numbers are: "+total);
        }
        else if (op.equals("*")){
            float total = no1 * no2;
            System.out.println("The product of the numbers are: "+total);
        }
        else if(op.equals("/")){
            float total = no1 / no2;
            System.out.println("The quotient of the numbers are: "+total);
        }
        else{
            System.out.println("Invalid");
        }


    }
}
