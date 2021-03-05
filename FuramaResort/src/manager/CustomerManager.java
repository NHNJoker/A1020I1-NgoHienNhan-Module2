package manager;

import common.ObjectFurama;
import common.WriteAndReadFileCSV;
import common.WriteAndReadFileCustomerCSV;
import models.Customer;

import java.util.*;
import java.util.regex.Pattern;

public class CustomerManager {
    public static void addNewCustomer() {
        ArrayList<models.Customer> customerArrayList = new ArrayList<models.Customer>();
        models.Customer customerObj = new models.Customer();
        addCustomer(customerObj);
        userException(customerObj);
        customerArrayList.add(customerObj);
        WriteAndReadFileCSV.writeFile(listStringCustomer(customerArrayList), ObjectFurama.CUSTOMER);
    }

    public static List<String> listStringCustomer(ArrayList<Customer> customerArrayList) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerArrayList) {
            stringList.add(customer.toString());
        }
        return stringList;
    }

    public static void addCustomer(Customer customer) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of customer:");
        customer.setNameCus(input.nextLine());
        System.out.println("Enter date of birth:");
        customer.setDateOfBirth(input.nextLine());
        System.out.println("Enter gender:");
        customer.setGender(input.nextLine());
        System.out.println("Enter id:");
        customer.setId(input.nextInt());
        input.nextLine();
        System.out.println("Enter email:");
        customer.setEmail(input.nextLine());
        System.out.println("Enter type of customer:\n" + "1. Diamond\n"
                + "2. Platinum\n" + "3. Gold\n" + "4. Silver\n" + "5. Member");
        int chose = input.nextInt();
        switch (chose) {
            case 1:
                customer.setTypeOfCus("Diamond");
                break;
            case 2:
                customer.setTypeOfCus("Platinum");
                break;
            case 3:
                customer.setTypeOfCus("Gold");
                break;
            case 4:
                customer.setTypeOfCus("Silver");
                break;
            case 5:
                customer.setTypeOfCus("Member");
                break;
        }
        input.nextLine();
        System.out.println("Enter address:");
        customer.setAddress(input.nextLine());
    }

    public static void showInformationCustomer() {
        ArrayList<Customer> customerArrayList = WriteAndReadFileCSV.readFileCustomer();
        Collections.sort(customerArrayList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o2.getNameCus().compareTo(o1.getNameCus()) != 0) {
                    return o2.getNameCus().compareTo(o1.getNameCus());
                } else {
                    int yearO1 = Integer.parseInt(o1.getDateOfBirth().substring(6, 10));
                    int yearO2 = Integer.parseInt(o2.getDateOfBirth().substring(6, 10));
                    return yearO1 - yearO2;
                }
            }
        });
        for (Customer customer : customerArrayList) {
            System.out.println(customer.toString());
            System.out.println("----------------------------");
        }
    }

    public static void userException(Customer customer) {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            if (!Pattern.matches("[A-Z][a-z]+([ ][A-Z][a-z]+|[ ][A-Z])+", customer.getNameCus())) {
                System.out.println("Client Name must capitalize first letter of each word.(Ex:Nguyen Van A)");
                customer.setNameCus(input.nextLine());
            } else {
                check = true;
            }
        }
        check = false;
        while (!check) {
            if (!Pattern.matches("([A-z]|[a-z]|[.])+[@][a-z]+[.][a-z]+", customer.getEmail())) {
                System.out.println("Email must be in the correct format abc@abc.abc.");
                customer.setEmail(input.nextLine());
            } else {
                check = true;
            }
        }
        check = false;
        while (!check) {
            if (!Pattern.matches("^((male)|(female)|(unknown))$", customer.getGender().toLowerCase())) {
                System.out.println("Enter gender (Male, Female, Unknown)");
                customer.setEmail(input.nextLine());
            } else {
                customer.setGender(customer.getGender().toLowerCase());
                String newGender = customer.getGender().substring(0, 1).toUpperCase() + customer.getGender().substring(1);
                customer.setGender(newGender);
                check = true;
            }
        }
        check = false;
        while (!check) {
            if (!Pattern.matches("[0-9]{9}$", Integer.toString(customer.getId()))) {
                System.out.println("The Id Card must have 9 digits and be in the format XXX XXX XXX");
                customer.setId(input.nextInt());
            } else {
                check = true;
            }
        }
        check = false;
        while (!check) {
            if (Pattern.matches("^(([0-2][0-9])|(30)|(31))\\/(([0][1-9])|([1][0-2]))\\/(([1][9][0-9)][0-9])|([2][0][0-2][0-1]))$", customer.getDateOfBirth())) {
                if ((Integer.parseInt(customer.getDateOfBirth().substring(6, 10)) + 18) <= Calendar.getInstance().get(Calendar.YEAR)) {
                    check = true;
                } else {
                    System.out.println("Year of birth must be greater than 1900 and less than 18 years from" +
                            " the current year, in the correct format dd / mm / yyyy");
                    customer.setDateOfBirth(input.nextLine());
                }
            } else {
                System.out.println("Year of birth must be greater than 1900 and less than 18 years from" +
                        " the current year, in the correct format dd / mm / yyyy");
                customer.setDateOfBirth(input.nextLine());
            }
        }
    }
}
