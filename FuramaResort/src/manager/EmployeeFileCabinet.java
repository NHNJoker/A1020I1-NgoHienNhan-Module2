package manager;

import common.WriteAndReadFileCSV;
import models.Employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class EmployeeFileCabinet {
    public static Stack<Employee> addEmployeeInFileCabinet() {
        ArrayList<Employee> employeeArrayList = WriteAndReadFileCSV.readFileEmployee();
        Stack<Employee> employeeStack = new Stack<>();
        for (Employee employee : employeeArrayList) {
            employeeStack.push(employee);
        }
        return employeeStack;
    }

    public static void searchEmployee(Stack<Employee> myEmployeeFileCabinet) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of employee:");
        String nameOfEmployee = input.nextLine();
        int count = 0;
        for (Employee employee: myEmployeeFileCabinet){
            if (employee.getNameOfEmployee().equals(nameOfEmployee)){
                System.out.println(employee);
                count++;
            }
        }
        if (count == 0){
            System.out.println("No employee found "+nameOfEmployee);
        }
    }
}
