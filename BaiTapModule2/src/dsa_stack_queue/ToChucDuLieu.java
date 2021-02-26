package dsa_stack_queue;

import java.util.*;

public class ToChucDuLieu {
    public static void addNewEmployee() {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        for (int i = 1; i <= 5; i++) {
            Employee employee = new Employee();
            System.out.println("Enter name of employee:");
            employee.setNameOfEmployee(input.nextLine());
            System.out.println("Enter gender:");
            employee.setGender(input.nextLine());
            System.out.println("Enter Date of birth:");
            employee.setDateOfBirth(input.nextLine());
            System.out.println("Enter id:");
            employee.setId(input.nextInt());
            System.out.println("Enter num of phone:");
            employee.setNumOfPhone(input.nextInt());
            input.nextLine();
            System.out.println("Enter Email:");
            employee.setEmail(input.nextLine());
            System.out.println("Enter level:\n" + "1.Intermediate\n" + "2.Colleges\n" + "3.University\n" +
                    "4.After university");
            int chooseLevel = input.nextInt();
            switch (chooseLevel) {
                case 1:
                    employee.setLevel("Intermediate");
                    break;
                case 2:
                    employee.setLevel("Colleges");
                    break;
                case 3:
                    employee.setLevel("University");
                    break;
                case 4:
                    employee.setLevel("After university");
                    break;
            }
            System.out.println("Enter work position:\n" + "1.Receptionist\n" +
                    "2.Staff\n" +
                    "3.Exert\n" +
                    "4.Supervisor\n" +
                    "5.Manager\n" +
                    "6.CEO");
            int choosePosition = input.nextInt();
            switch (choosePosition) {
                case 1:
                    employee.setWorkPosition("Receptionist");
                    break;
                case 2:
                    employee.setWorkPosition("Staff");
                    break;
                case 3:
                    employee.setWorkPosition("Exert");
                    break;
                case 4:
                    employee.setWorkPosition("Supervisor");
                    break;
                case 5:
                    employee.setWorkPosition("Manager");
                    break;
                case 6:
                    employee.setWorkPosition("CEO");
                    break;
            }
            input.nextLine();
            System.out.println("Enter address:");
            employee.setAddressOfEmployee(input.nextLine());
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
        while (!NU.isEmpty()){
            listEmployeeSortByGender.add(NU.poll());
        }
        while (!NAM.isEmpty()){
            listEmployeeSortByGender.add(NAM.poll());
        }
        WriteAndReadFileEmployeeCSV.writeFile(listEmployeeSortByGender);
    }
}
