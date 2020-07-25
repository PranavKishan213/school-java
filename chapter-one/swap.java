package com.company;

import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Integer int_1 = sc1.nextInt();
        Integer int_2 = sc2.nextInt();

        int_1 = int_1 + int_2;
        int_2 = int_1 - int_2;
        int_1 = int_1 - int_2;

        System.out.println("The numbers are: " +int_1+ " and " +int_2);

    }
}
