package models;

import common.WriteAndReadFileCustomerCSV;

import java.util.*;
import java.util.regex.Pattern;

public class Customer {
    private String nameCus;
    private String dateOfBirth;
    private String gender;
    private int id;
    private String email;
    private String typeOfCus;
    private String address;
    private Services useService;

    public Customer() {
    }

    public Customer(String nameCus, String dateOfBirth, String gender, int id, String email,
                    String typeOfCus, String address, Services useService) {
        this.nameCus = nameCus;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
        this.email = email;
        this.typeOfCus = typeOfCus;
        this.address = address;
        this.useService = useService;
    }


    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCus() {
        return typeOfCus;
    }

    public void setTypeOfCus(String typeOfCus) {
        this.typeOfCus = typeOfCus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUseService() {
        return useService;
    }

    public void setUseService(Services useService) {
        this.useService = useService;
    }

    @Override
    public String toString() {
        return nameCus + ',' +
                dateOfBirth + ','
                + gender + ',' +
                +id + ','
                + email + ','
                + typeOfCus + ','
                + address + ','
                + useService
                ;
    }

    public void showInfor(Customer customer) {
        System.out.println(customer.toString());
    }

    public static void main(String[] args) {
        Services services = new Villa();
        Customer customer = new Customer();
        customer.setUseService(services);
        System.out.println(customer.toString());
    }
}