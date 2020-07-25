package com.company;

import java.util.Scanner;

public class add_class {
    static void add(float a, float b){
        float total = a + b;
        System.out.println("The total is: "+total);
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter in your first number: ");
        float a = data.nextFloat();
        System.out.println("Enter in your second number: ");
        float b = data.nextFloat();
        add(a, b);
    }
}
