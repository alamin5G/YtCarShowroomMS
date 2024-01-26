package com.goonok;

import com.goonok.implement.Cars;
import com.goonok.implement.Client;
import com.goonok.implement.Employees;
import com.goonok.implement.Showroom;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employees[] employees = new Employees[5];
        Cars[] cars = new Cars[5];

        ///TODO - instead declaring an array, we can use List interface;

        Client menuClient = new Client();

        int carCounter = 0;
        int showroomCounter = 0;
        int employeeCounter = 0;
        int choice = -100;
        while(choice!=0){
            menuClient.main_menu();
            choice = input.nextInt();
            while (choice!=9 && choice!=0){
                switch (choice){
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1. ADD New Showroom");
                        System.out.println("9. Go Back to Main Menu");
                        choice = input.nextInt();
                        break;
                    case 2:
                        employees[employeeCounter] = new Employees();
                        employees[employeeCounter].setDetails();
                        employeeCounter++;
                        System.out.println();
                        System.out.println("1. Recruit New Employee");
                        System.out.println("9. Go Back to Main Menu");
                        choice = input.nextInt();
                        break;
                    case 3:
                        cars[carCounter] = new Cars();
                        cars[carCounter].setDetails();
                        carCounter++;
                        System.out.println();
                        System.out.println("1. Add Cars");
                        System.out.println("9. Go Back to Main Menu");
                        choice = input.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i<showroomCounter; i++){
                            showroom[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0. Exit");
                        System.out.println("9. Go Back to Main Menu");
                        choice = input.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i<employeeCounter; i++){
                            employees[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0. Exit");
                        System.out.println("9. Go Back to Main Menu");
                        choice = input.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i<carCounter; i++){
                            cars[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("0. Exit");
                        System.out.println("9. Go Back to Main Menu");
                        choice = input.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid Choice");
                        break;
                }
            }
        }

         }
}