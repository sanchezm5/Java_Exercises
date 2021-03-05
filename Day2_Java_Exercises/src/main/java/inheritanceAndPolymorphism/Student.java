package inheritanceAndPolymorphism;

public class Student extends Person {

    enum ClassStatus {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }
    ClassStatus classStatus;

    public Student(String name, String address, String phoneNumber, String email, ClassStatus classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public ClassStatus getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(ClassStatus classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", classStatus=" + classStatus + '\'' +
                '}';
    }
}
