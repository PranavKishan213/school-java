package com.company;

import java.util.Scanner;

class emp{
    String employee;
    float BaseSalary;

    public void assignment(String emp, float BS){
        employee = emp;
        BaseSalary = BS;
    }

    public float TotalSalary(){
        float hra = BaseSalary/2;
        BaseSalary = BaseSalary + hra;
        return BaseSalary;
    }
}

public class employee {
    public static void main(String args[]){
        emp employee1 = new emp();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in the name: ");
        String data1 = sc.next();
        System.out.println("Enter in the base salary: ");
        float data2 = sc.nextFloat();
        employee1.assignment(data1, data2);
        float total = employee1.TotalSalary();
        System.out.println("The name of the employee is: "+data1);
        System.out.println("The total salary is: "+total);
    }



}
