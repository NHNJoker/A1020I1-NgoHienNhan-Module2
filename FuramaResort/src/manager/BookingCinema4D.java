package manager;

import common.WriteAndReadFileCustomerCSV;
import models.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BookingCinema4D {
    public static void booking(Queue<String> myQueueBookingCinema) {
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customerArrayList = WriteAndReadFileCustomerCSV.readFile();
        System.out.println("List customer:");
        int count = 1;
        for (Customer customer : customerArrayList) {
            System.out.println(count + ". " + customer.getNameCus() + ", " + customer.getId());
            count++;
        }
        System.out.println("Enter customer:");
        int indexCustomer = input.nextInt();
        myQueueBookingCinema.offer(customerArrayList.get((indexCustomer - 1)).getNameCus());
    }

    public static void displayListBookingCinema(Queue<String> myQueueBookingCinema) {
        System.out.println("List booking cinema:");
        while (!myQueueBookingCinema.isEmpty()){
            System.out.println(myQueueBookingCinema.poll());
        }
    }
}
