package com.goonok.implement;

import com.goonok.interfaces.Utility;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility {

    protected String employeeId;
    protected String employeeName;
    protected int employeeAge;
    protected String employeeDepartment;

    @Override
    public void getDetails() {
        System.out.println("ID : " + employeeId);
        System.out.println("Name: " +employeeName );
        System.out.println("Age: " +employeeAge );
        System.out.println("Department: " +employeeDepartment );
        System.out.println("Showroom Name: " + showroomName);
    }

    @Override
    public void setDetails() {
        Scanner input = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        employeeId = String.valueOf(uuid);
        System.out.println("==========================Enter Employee Details =====================");
        System.out.println();
        System.out.print("Employee Name: ");
        employeeName = input.nextLine();
        System.out.print("Employee Age: ");
        employeeAge = input.nextInt();
        input.nextLine();
        System.out.print("Employee Department: ");
        employeeDepartment = input.nextLine();
        System.out.print("Showroom Name: ");
        showroomName = input.nextLine();
    }
}
