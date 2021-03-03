package dsa_stack_queue;

public class Employee {
    private String nameOfEmployee;
    private String age;
    private String gender;
    private String dateOfBirth;

    @Override
    public String toString() {
        return "Employee{" +
                "nameOfEmployee='" + nameOfEmployee + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
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
}