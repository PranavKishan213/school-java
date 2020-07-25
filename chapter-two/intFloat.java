package com.company;

import java.util.Scanner;

public class intFloat {
    static void subtract_int(int a, float b){
        int b_int = (int) b;
        int total = a - b_int;
        System.out.println("The difference is: "+total);
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter in your first number: ");
        int a = data.nextInt();
        System.out.println("Enter in your second number: ");
        float b = data.nextFloat();
        subtract_int(a, b);
    }
}
