package com.company;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println("Type in a number:");
        Scanner Scan = new Scanner(System.in);
        Integer num  = Scan.nextInt();

        if (num%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
