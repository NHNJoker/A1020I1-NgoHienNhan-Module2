package controllers;

import manager.BookingCinema4D;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainBookingCinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> myQueueBookingCinema = new LinkedList<>();
        System.out.println("Enter max num of ticket");
        int maxOfTicket = input.nextInt();
        for (int i = 1; i <= maxOfTicket; i++) {
            BookingCinema4D.booking(myQueueBookingCinema);
        }
        BookingCinema4D.displayListBookingCinema(myQueueBookingCinema);
    }
}
