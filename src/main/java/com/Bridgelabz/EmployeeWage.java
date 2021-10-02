package com.Bridgelabz;

import java.util.Random;

/*
Welcome to Employee
Wage Computation
Program on Master Branch
 */
public class EmployeeWage {
    public static void main(String[] args) {
        int IS_PRESENT=1;
        Random num=new Random();
        int Attendance= num.nextInt(2);
        if (Attendance==IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
