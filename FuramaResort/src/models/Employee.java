package models;

import common.WriteAndReadFileEmployeeCSV;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Employee {
    private String nameOfEmployee;
    private String age;
    private String dateOfBirth;
    private String email;
    private int id;
    private int numOfPhone;
    private String level;
    private String workPosition;
    private int salary;
    private String addressOfEmployee;

    @Override
    public String toString() {
        return "nameOfEmployee='" + nameOfEmployee + '\'' +
                ", age=" + age +
                ", addressOfEmployee='" + addressOfEmployee + '\'';
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddressOfEmployee() {
        return addressOfEmployee;
    }

    public void setAddressOfEmployee(String addressOfEmployee) {
        this.addressOfEmployee = addressOfEmployee;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumOfPhone() {
        return numOfPhone;
    }

    public void setNumOfPhone(int numOfPhone) {
        this.numOfPhone = numOfPhone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}