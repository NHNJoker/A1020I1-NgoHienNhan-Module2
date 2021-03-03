package dsa_stack_queue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteAndReadFileEmployeeCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String HEADER = "Name,Age,Gender,Date of birth";

    public static void writeFile(ArrayList<Employee> employeeArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/dsa_stack_queue/Employee.csv");
            fileWriter.append(HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Employee employee : employeeArrayList) {
                fileWriter.append(employee.getNameOfEmployee());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAge()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(employee.getDateOfBirth());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception exception) {
            exception.getMessage();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception exception) {
                exception.getMessage();
            }
        }
    }


    public static ArrayList<Employee> readFile() {
        BufferedReader br = null;
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Path path = Paths.get("src/dsa_stack_queue/Employee.csv");
        if (!Files.exists(path)) {
            try {
                FileWriter fileWriter = new FileWriter("src/dsa_stack_queue/Employee.csv");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader("src/dsa_stack_queue/Employee.csv"));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setNameOfEmployee(splitData[0]);
                employee.setAge(splitData[1]);
                employee.setGender(splitData[2]);
                employee.setDateOfBirth(splitData[3]);
                employeeList.add(employee);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
        return employeeList;
    }
}