package com.Bridgelabz;

import java.util.Random;

/*
Welcome to Employee
Wage Computation
Program on Master Branch
 */
public class EmployeeWage {
    public static void main(String[] args) {
        WageCalculate();
    }
    static void WageCalculate (){
        int IS_PRESENT=1;
        Random num=new Random();
        int Attendance= num.nextInt(2);
        if (Attendance==IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
        int WagePerHr=20, FullDayHr=8, TotalHr=0;
        switch (Attendance){
            case 1:
                TotalHr+=8;
                break;
            default:
                TotalHr+=0;
        }
        System.out.println("Daily Employee Wage is: "+TotalHr);
    }
}
