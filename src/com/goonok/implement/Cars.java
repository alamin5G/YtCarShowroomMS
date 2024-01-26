package com.goonok.implement;

import com.goonok.interfaces.Utility;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {

    protected String carName;
    protected String carColor;
    protected String carFuelType;
    protected int carPrice;
    protected String carType;
    protected String carTransmission;


    @Override
    public void getDetails() {
        System.out.println("Name : " + carName);
        System.out.println("Car Color : " + carColor);
        System.out.println("Fuel Type: " + carFuelType);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Type: " + carType);
        System.out.println("Car Transmission: " + carTransmission);

    }

    @Override
    public void setDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("=================Enter Car Details================");
        System.out.println();
        System.out.print("Car Name: " );
        carName = input.nextLine();
        System.out.print("Car Color: " );
        carColor = input.nextLine();
        System.out.print("Car Fuel Type(Petrol/Diesel): ");
        carFuelType = input.nextLine();
        System.out.print("Car Type(SEDAN/SUV/HATCHBACK): ");
        carType = input.nextLine();
        System.out.print("Transmission Type: (Automatic/Manual): ");
        carTransmission  = input.nextLine();
        System.out.print("Car Price: ");
        carPrice = input.nextInt();
        totalCarsInStock++;
    }
}
