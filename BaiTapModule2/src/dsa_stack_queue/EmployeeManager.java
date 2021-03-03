package dsa_stack_queue;

import java.util.*;

public class EmployeeManager {
    public static void addNewEmployee() {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Employee employee = new Employee();
            System.out.println("Enter name of employee:");
            employee.setNameOfEmployee(input.nextLine());
            System.out.println("Enter gender:");
            employee.setGender(input.nextLine());
            System.out.println("Enter Date of birth:");
            employee.setDateOfBirth(input.nextLine());
            employee.setAge(String.valueOf(Calendar.getInstance().get(Calendar.YEAR) -
                    Integer.parseInt(employee.getDateOfBirth().substring(6, 10))));
            employeeArrayList.add(employee);
        }
        WriteAndReadFileEmployeeCSV.writeFile(employeeArrayList);
    }

    public static void sortByDateOfBirth() {
        ArrayList<Employee> employeeArrayList = WriteAndReadFileEmployeeCSV.readFile();
        Collections.sort(employeeArrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int year01 = Integer.parseInt(o1.getDateOfBirth().substring(6, 10));
                int year02 = Integer.parseInt(o2.getDateOfBirth().substring(6, 10));
                return year01 - year02;
            }
        });
        WriteAndReadFileEmployeeCSV.writeFile(employeeArrayList);
    }

    public static void demergingQueue() {
        Queue<Employee> NU = new LinkedList<>();
        Queue<Employee> NAM = new LinkedList<>();
        ArrayList<Employee> employeeArrayList = WriteAndReadFileEmployeeCSV.readFile();
        for (Employee employeeList : employeeArrayList) {
            if (employeeList.getGender().equals("Nu")) {
                NU.offer(employeeList);
            } else {
                NAM.offer(employeeList);
            }
        }
        ArrayList<Employee> listEmployeeSortByGender = new ArrayList<>();
        while (!NU.isEmpty()) {
            listEmployeeSortByGender.add(NU.poll());
        }
        while (!NAM.isEmpty()) {
            listEmployeeSortByGender.add(NAM.poll());
        }
        WriteAndReadFileEmployeeCSV.writeFile(listEmployeeSortByGender);
    }
}
