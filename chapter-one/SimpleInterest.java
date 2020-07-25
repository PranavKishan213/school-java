package com.company;

import java.util.Scanner;

public class SimpleInterest {
    static void interest(float principal_amount, float interest_rate, float duration){
        float simple_interest = principal_amount * interest_rate * duration;
        System.out.println("The simple interest is: "+simple_interest);
    }

    public static void main(String[] args){
        System.out.println("Enter in the principal amount: ");
        Scanner data1 = new Scanner(System.in);
        float principal_amount = data1.nextFloat();
        System.out.println("Enter in the interest rate: ");
        float interest_rate = data1.nextFloat();
        System.out.println("Enter in the duration(in years): ");
        float duration = data1.nextFloat();

        interest(principal_amount, interest_rate, duration);

    }
}
