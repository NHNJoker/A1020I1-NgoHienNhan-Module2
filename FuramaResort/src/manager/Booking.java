package manager;

import common.ObjectFurama;
import common.WriteAndReadFileCSV;
import models.*;
import models.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {
    private static final String COMMA = ",";

    public static void addNewBooking() {
        Scanner input = new Scanner(System.in);
        ArrayList<models.Customer> listBooking = new ArrayList<models.Customer>();
        ArrayList<models.Customer> arrayList = WriteAndReadFileCSV.readFileCustomer();
        int i = 1;
        for (models.Customer customer : arrayList) {
            System.out.println(i + ". " + customer.getNameCus());
            i++;
        }
        System.out.println("Chon khach hang dat dich vu:");
        int indexCustomer = (input.nextInt() - 1);
        System.out.println("1.Villa \n" +
                "2.House \n" +
                "3.Room");
        int choose = input.nextInt();
        int numOder = 1;
        switch (choose) {
            case 1:
                ArrayList<Services> showListDataVilla = new ArrayList<Services>();
                showListDataVilla = WriteAndReadFileCSV.readFileVilla();
                for (Services services : showListDataVilla) {
                    System.out.println(numOder + ". " + ((Villa) services).getId() + "," + ((Villa) services).getServiceName());
                    numOder++;
                }
                int indexService = (input.nextInt() - 1);
                models.Customer customer = arrayList.get(indexCustomer);
                Villa villa = (Villa) showListDataVilla.get(indexService);
                customer.setUseService(villa);
                listBooking.add(customer);
                WriteAndReadFileCSV.writeFile(listStringBooking(listBooking), ObjectFurama.BOOKING);
                break;
            case 2:
                ArrayList<Services> showListDataHouse = new ArrayList<Services>();
                showListDataHouse = WriteAndReadFileCSV.readFileHouse();
                for (Services services : showListDataHouse) {
                    System.out.println(numOder + ". " + ((House) services).getServiceName());
                    numOder++;
                }
                int indexServiceHouse = (input.nextInt() - 1);
                models.Customer customer1 = arrayList.get(indexCustomer);
                House house = (House) showListDataHouse.get(indexServiceHouse);
                customer1.setUseService(house);
                listBooking.add(customer1);
                WriteAndReadFileCSV.writeFile(listStringBooking(listBooking), ObjectFurama.BOOKING);
                break;
            case 3:
                ArrayList<Services> showListDataRoom = new ArrayList<Services>();
                showListDataRoom = WriteAndReadFileCSV.readFileRoom();
                for (Services services : showListDataRoom) {
                    System.out.println(numOder + ". " + ((Room) services).getServiceName());
                    numOder++;
                }
                int indexServiceRoom = (input.nextInt() - 1);
                Customer customer2 = arrayList.get(indexCustomer);
                Room room = (Room) showListDataRoom.get(indexServiceRoom);
                customer2.setUseService(room);
                listBooking.add(customer2);
                WriteAndReadFileCSV.writeFile(listStringBooking(listBooking),ObjectFurama.BOOKING);
                break;
        }
    }

    public static List<String> listStringBooking(ArrayList<Customer> bookingArrList) {
        List<String> stringList = new ArrayList<>();
        for (Customer booking : bookingArrList) {
            stringList.add(booking.getId() + COMMA + booking.getNameCus() + COMMA + booking.getUseService().getId() +
                    COMMA + booking.getUseService().getServiceName());
        }
        return stringList;
    }
}
