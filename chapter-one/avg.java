package com.company;

import java.util.Scanner;

public class avg {
    static void average(float num1, float num2, float num3){
        float average = (num1 + num2 + num3)/3;
        System.out.println("The average is: "+average);
    }
    public static void main(String args[]){
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        Float num1 = data.nextFloat();
        System.out.println("Enter your second number: ");
        Float num2 = data.nextFloat();
        System.out.println("Enter your third number: ");
        Float num3 = data.nextFloat();
        average(num1, num2, num3);
    }
}
