package controllers;

import manager.EmployeeFileCabinet;
import models.Employee;

import java.util.Stack;

public class MainSearchEmployee {
    public static void main(String[] args) {
        Stack<Employee> myEmployeeFileCabinet = new Stack<>();
        EmployeeFileCabinet.addEmployeeInFileCabinet(myEmployeeFileCabinet);
        EmployeeFileCabinet.searchEmployee(myEmployeeFileCabinet);
    }
}
