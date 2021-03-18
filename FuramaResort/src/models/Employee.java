package models;

public class Employee {
    private String nameOfEmployee;
    private String age;
    private String dateOfBirth;
    private String email;
    private String id;
    private int employeeID;
    private String numOfPhone;
    private String level;
    private String workPosition;
    private double salary;
    private String addressOfEmployee;

    @Override
    public String toString() {
        return
                nameOfEmployee + ',' +
                        age + ',' +
                        dateOfBirth + ',' +
                        email + ',' +
                        id +','+
                        employeeID+','+
                        numOfPhone +','+
                        level + ',' +
                        workPosition + ',' +
                        salary +','+
                        addressOfEmployee;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumOfPhone() {
        return numOfPhone;
    }

    public void setNumOfPhone(String  numOfPhone) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}