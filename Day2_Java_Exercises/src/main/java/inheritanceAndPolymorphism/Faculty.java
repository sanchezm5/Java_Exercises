package inheritanceAndPolymorphism;

import java.time.LocalDate;

public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, float salary, LocalDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty {" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", office='" + getOffice() + '\'' +
                ", salary=" + getSalary() + '\'' +
                ", dateHired=" + getDateHired() + '\'' +
                ", officeHours=" + officeHours + '\'' +
                ", rank=" + rank + '\'' +
                '}';
    }
}
