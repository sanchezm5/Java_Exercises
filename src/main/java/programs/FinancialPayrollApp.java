package programs;

import java.util.Scanner;

/** Financial Payroll Application: Write a program that reads the following information and prints a payroll statement:
 *      Employee's name (e.g., Smith)
 *      Number of hours worked in a week (e.g., 10)
 *      Hourly pay rate (e.g., 6.75)
 *      Federal tax withholding rate (e.g., 20%)
 *      State tax withholding rate (e.g., 9%)
 *
 *  Example:
 *      Enter employee's name:
 *      Enter number of hours worked in a week:
 *      Enter hourly pay rate:
 *      Enter federal tax withholding rate:
 *      Enter state tax withholding rate:
 *
 *      Employee Name: Smith
 *      Hours Worked: 10.0
 *      Pay Rate: $6.75
 *      Gross Pay: $67.5
 *      Deductions:
 *      Federal Withholding (20.0%): $13.5
 *      State Withholding (9.0%): $6.07
 *      Total Deduction: $19.57
 *      Net Pay: $47.92
 */

public class FinancialPayrollApp {

    public static void printPayrollStatement() {
        String name;
        float hours;
        float payRate;
        float fedTax;
        float stateTax;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        name = scan.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        hours = Float.parseFloat(scan.nextLine());
        System.out.println(hours);



    }

    public static void main(String[] args) {
        printPayrollStatement();
    }
}
