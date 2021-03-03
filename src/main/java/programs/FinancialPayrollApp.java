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
        Scanner scan = new Scanner(System.in);

        // Prompts
        System.out.print("Enter employee's name: ");
        String name = scan.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        float hours = Float.parseFloat(scan.nextLine());
        System.out.print("Enter hourly pay rate: $");
        float payRate = Float.parseFloat(scan.nextLine());
        System.out.print("Enter federal tax withholding rate as a percentage: ");
        float fedTax = Float.parseFloat(scan.nextLine());
        System.out.print("Enter state tax withholding rate as a percentage: ");
        float stateTax = Float.parseFloat(scan.nextLine());
        scan.close();

        // Print payroll statement
        System.out.println("\n********** Payroll Statement **********");
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        float grossPay = payRate * hours;
        System.out.printf("Gross Pay: $%.2f", grossPay);
        System.out.println("\nDeductions: ");

        float fedWithholding = payRate * hours * fedTax/100;
        System.out.printf("   Federal Withholding: $%.2f", fedWithholding);
        float stateWithholding = payRate * hours * stateTax/100;
        System.out.printf("\n   State Withholding: $%.2f", stateWithholding);
        float deduction = fedWithholding + stateWithholding;
        System.out.printf("\nTotal Deduction: $%.2f", deduction);
        System.out.printf("\nNet Pay: $%.2f", grossPay - deduction);
    }

    public static void main(String[] args) {
        printPayrollStatement();
    }
}
