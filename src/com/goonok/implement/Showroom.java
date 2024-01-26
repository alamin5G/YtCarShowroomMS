package com.goonok.implement;

import com.goonok.interfaces.Utility;

import java.util.Scanner;

public class Showroom implements Utility {
    protected String showroomName;
    protected String showroomAddress;
    protected int totalEmployees;
    protected int totalCarsInStock;
    protected String managerName;

    @Override
    public void getDetails() {
        System.out.println("Showroom Name: " + this.showroomName);
        System.out.println("Showroom Address: " + this.showroomAddress);
        System.out.println("Manager Name: " + this.managerName);
        System.out.println("Total Employees : " + this.totalEmployees);
        System.out.println("Total Cars in Stock: " +this.totalCarsInStock );
    }

    @Override
    public void setDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("=============== Enter Showroom Details =============");
        System.out.println();
        System.out.print("Showroom Name: ");
        showroomName = input.nextLine();
        System.out.print("Showroom Address: ");
        showroomAddress = input.nextLine();
        System.out.print("Manager Name: ");
        managerName = input.nextLine();
        System.out.print("Total No. of Employees: ");
        totalEmployees = input.nextInt();
        System.out.print("Total Cars in Stock: ");
        totalCarsInStock = input.nextInt();
    }
}
