package controllers;

import manager.EmployeeFileCabinet;

public class MainSearchEmployee {
    public static void main(String[] args) {
        EmployeeFileCabinet.searchEmployee(EmployeeFileCabinet.addEmployeeInFileCabinet());
    }
}
