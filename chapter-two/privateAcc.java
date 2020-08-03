package com.company;

import java.util.Scanner;

class private_variable{
    private int variable1 = 1;
    private int variable2 = 1;

    public int getVariable1() { return variable1; }
    public int getVariable2() { return variable2;}
    public void assignment1() {
        Scanner sc = new Scanner(System.in);
        variable1 = sc.nextInt();
    }
    public void assignment2() {
        Scanner sc = new Scanner(System.in);
        variable2 = sc.nextInt();
    }
}

public class privateAcc {

    public static void main(String args[]){
        private_variable PV = new private_variable();
        System.out.println("Enter in your first number: ");
        PV.assignment1();
        System.out.println("Enter in your second number: ");
        PV.assignment2();
        int data = PV.getVariable1();
        int data2 = PV.getVariable2();
        System.out.println(data);
        System.out.println(data2);

    }

}
