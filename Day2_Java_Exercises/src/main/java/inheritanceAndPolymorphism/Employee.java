package inheritanceAndPolymorphism;

import java.time.LocalDate;

public class Employee extends Person {

    private String office;
    private float salary;
    private LocalDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, float salary, LocalDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", office='" + office + '\'' +
                ", salary=" + salary + '\'' +
                ", dateHired=" + dateHired + '\'' +
                '}';
    }
}
