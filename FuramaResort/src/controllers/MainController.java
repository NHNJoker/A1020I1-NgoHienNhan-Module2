package controllers;

import manager.Booking;
import manager.CustomerManager;
import manager.EmployeeManager;
import manager.ServiceManager;
import models.*;

import java.util.Scanner;

public class MainController {

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);

        boolean check = false;
        while (!check) {
            System.out.println("1. Add new services");
            System.out.println("2. Show service");
            System.out.println("3. Add new customer");
            System.out.println("4. Show information of customer");
            System.out.println("5. Add new booking");
            System.out.println("6. Show information of employee");
            System.out.println("7. Exit");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    ServiceManager.addNewServices();
                    break;
                case 2:
                    ServiceManager.showServices();
                    break;
                case 3:
                    CustomerManager.addNewCustomer();
                    break;
                case 4:
                    CustomerManager.showInformationCustomer();
                    break;
                case 5:
                    Booking.addNewBooking();
                    break;
                case 6:
                    EmployeeManager.displayEmployee();
                    break;
                case 7:
                    check = true;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        displayMainMenu();
    }
}
