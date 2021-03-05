/**
 *  Inheritance and Polymorphism: (The Person, Student, Employee, Faculty, and Staff classes)
 *  Design a class named Person and its two subclasses named Student and Employee. Make Faculty and Staff subclasses
 *  of Employee. A person has a name, address, phone number, and email address. A student has a class status (freshman,
 *  sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired.
 *  Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. A faculty member has
 *  office hours and a rank. A staff member has a title. Override the toString method in each class to display the class
 *  name and the person's name. Write a test program that creates a Person, Student, Employee, Faculty, and Staff.
 */

package inheritanceAndPolymorphism;

import java.time.LocalDate;

public class Main_InheritanceAndPolymorphism {

    public static void main(String[] args) {

        System.out.println("This is the main class for the Inheritance and Polymorphism Assignment (Day 2)");
        System.out.println("******************************************************************************\n");

        Person p1 = new Person("Person Name",
                "123 Main St, City, NJ 07111",
                "9735551222",
                "person@email.com");
        System.out.println(p1);

        Person p2 = new Student("Student Name",
                "111 Main Ave, City, NJ 07111",
                "9735551234",
                "student@email.com",
                Student.ClassStatus.SENIOR);
        System.out.println(p2);

        Person p3 = new Employee("Employee Name",
                "222 Day St, City, NJ 07222",
                "9735551212",
                "employee@email.com",
                "A100", 25000f,
                LocalDate.of(2000,04,11));
        System.out.println(p3);

        Person p4 = new Faculty("Faculty Name",
                "333 Main St, City, NJ 07333",
                "9735553333",
                "faculty@email.com",
                "A300",
                37000f,
                LocalDate.of(2010,03,11),
                "Morning",
                "Instructor");
        System.out.println(p4);

        Person p5 = new Staff("Staff Name",
                "444 Main St, City, NJ 07444",
                "9735551444",
                "staff@email.com",
                "B100",
                25000f,
                LocalDate.of(2017, 04,17),
                "HR Manager");
        System.out.println(p5);
    }
}
