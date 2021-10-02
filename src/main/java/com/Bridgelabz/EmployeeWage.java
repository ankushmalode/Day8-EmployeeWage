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

    static void WageCalculate() {
        int IS_PRESENT = 1, PartTimePresent = 2, WagePerHr = 20, FullDayHr = 8, TotalHr = 0, PartTimeHr = 4, DayPerMonth = 20;
        for (int i = 0; i <= DayPerMonth; i++) {
            Random num = new Random();
            int Attendance = num.nextInt(3);
            if (Attendance == IS_PRESENT)
                System.out.println("Employee is Present");
            else if (Attendance == PartTimePresent)
                System.out.println("Employee is Present but for Part Time");
            else
                System.out.println("Employee is Absent");

            switch (Attendance) {
                case 1:
                    TotalHr += FullDayHr;
                    break;
                case 2:
                    TotalHr += PartTimeHr;
                    break;
                default:
                    TotalHr += 0;
            }
        }
        System.out.println("Daily Employee Wage is: " + TotalHr);
    }
}
