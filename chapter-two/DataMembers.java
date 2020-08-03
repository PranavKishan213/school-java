package com.company;

import java.util.Scanner;

class Data{
    int num1 = 3;
    float num2;
    double num3;

    public int getdata(){ return num1;}
    public void calc(double no1){
        System.out.println(no1);
    }
    public int sum(int no1, int no2){
        int sum = no1 + no2;
        System.out.println(sum);
        return sum;
    }

}

public class DataMembers {
    public static void main(String args[]){
        Data d = new Data();
        int d1 = d.getdata();
        System.out.println(d1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double: ");
        double d2 = sc.nextDouble();
        d.calc(d2);
        System.out.println("Enter in two integers: ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int one = d.sum(no1, no2);

    }
}
