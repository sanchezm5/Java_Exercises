package inheritanceAndPolymorphism;

import java.time.LocalDate;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, float salary, LocalDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", office='" + getOffice() + '\'' +
                ", salary=" + getSalary() + '\'' +
                ", dateHired=" + getDateHired() + '\'' +
                "title='" + title + '\'' +
                '}';
    }
}
