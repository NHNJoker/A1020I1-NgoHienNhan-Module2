package controllers;

import manager.*;
import models.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainController {

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);

        boolean check = false;
        while (!check) {
            System.out.println("1. Add new services\n" +
                    "2. Show service\n" +
                    "3. Add new customer\n" +
                    "4. Show information of customer\n" +
                    "5. Add new booking\n" +
                    "6. Add new employee\n" +
                    "7. Search employee\n" +
                    "8. Show information of employee\n" +
                    "9. Booking cinema\n" +
                    "10. Exit");
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
                    EmployeeManager.addNewEmployee();
                    break;
                case 7:
                    EmployeeFileCabinet.searchEmployee(EmployeeFileCabinet.addEmployeeInFileCabinet());
                    break;
                case 8:
                    EmployeeManager.displayEmployee();
                    break;
                case 9:
                    Queue<String> myQueueBookingCinema = new LinkedList<>();
                    System.out.println("Enter max num of ticket");
                    int maxOfTicket = input.nextInt();
                    for (int i = 1; i <= maxOfTicket; i++) {
                        BookingCinema4D.booking(myQueueBookingCinema);
                    }
                    BookingCinema4D.displayListBookingCinema(myQueueBookingCinema);
                    break;
                case 10:
                    check = true;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
