/**
 *  (A Bank Application)
 *  Account class that contains:
 *      -A private int data field named id for the account (default 0).
 *      -A private double data field named balance for the account (default 0).
 *      -A private double data field named annualInterestRate that stores the current interest rate (default 0).
 *       Assume all accounts have the same interest rate.
 *      -A private Date data field named dateCreated that stores the date when the account was created.
 *      -A no-arg constructor that creates a default account.
 *      -A constructor that creates an account with the specified id and initial balance.
 *      -The accessor and mutator methods for id, balance, and annualInterestRate.
 *      -The accessor method for dateCreated.
 *      -A method named getMonthlyInterestRate() that returns the monthly interest rate.
 *      -A method named getMonthlyInterest() that returns the monthly interest.
 *      -A method named withdraw that withdraws a specified amount from the account.
 *      -A method named deposit that deposits a specified amount to the account
 *      -The method getMonthlyInterest() is to return monthly interest, not the interest rate.
 *       Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12.
 *       Note that annualInterestRate is a percentage, e.g.,like 4.5%. You need to divide it by 100.
 *      -Look at the Account class Account.java and write a main method in a different class to briefly experiment with
 *       some instances of the Account class.
 *
 *       Using the Account class as a base class, write two derived classes called
 *       SavingsAccount and CurrentAccount. A SavingsAccount object, in addition to the attributes of an Account object,
 *       should have an interest variable and a method which adds interest to the account. A CurrentAccount object, in
 *       addition to the attributes of an Account object, should have an overdraft limit variable. Ensure that you have
 *       overridden methods of the Account class as necessary in both derived classes. Now create a Bank class, an object
 *       of which contains an array of Account objects. Accounts in the array could be instances of the Account class,
 *       the SavingsAccount class, or the CurrentAccount class. Create some test accounts (some of each type).
 *       Write an update method in the bank class. It iterates through each account, updating it in the following ways:
 *       -Savings accounts get interest added (via the method you already wrote); CurrentAccounts get a letter sent if
 *       they are in overdraft. The Bank class requires methods for opening and closing accounts, and for paying a
 *       dividend into each account.
 *
 *  Hints: Note that the balance of an account may only be modified through the deposit(double) and withdraw(double)
 *  methods. The Account class should not need to be modified at all. Be sure to test what you have done after each step.
 */

package oops;

public class Main_OOPs {

    // Use to test Bank Application
    public static void main(String[] args) {
        System.out.println("This is the main class for the OOPs: Bank Application Assignment (Day 2)");

        Bank bank = new Bank();

        Account a1 = new Account(1,100);
        a1.setAnnualInterestRate(0.5);
        System.out.println(bank.openAccount(a1));
        Account a2 = new Account(2,200);
        bank.openAccount(a2);

        SavingsAccount s3 = new SavingsAccount(3,10,.50);
        bank.openSavingsAccount(s3);
        s3.deposit(10);
        System.out.println(bank.toString());
        s3.withdraw(50);
        System.out.println(bank.toString());
        SavingsAccount s4 = new SavingsAccount(4,20,1.50);
        System.out.println(bank.openSavingsAccount(s4));
        System.out.println(s4 + " before interest");
        bank.payDividendIntoAccount(s4,s4.getMonthlyInterest());
        System.out.println(s4 + " after added interest");

        CurrentAccount c5 = new CurrentAccount(5, 30,50);
        bank.openCurrentAccount(c5);
        c5.withdraw(35);
        CurrentAccount c6 = new CurrentAccount(6, 40,50);
        System.out.println(bank.openCurrentAccount(c6));
        CurrentAccount c7 = new CurrentAccount(7, 50,50);
        bank.openCurrentAccount(c7);
        System.out.println(c7);
        bank.closeCurrentAccount(c7);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(bank.toString());
        System.out.println(bank.updateAccounts(bank.getAccounts()));
        System.out.println(bank.toString());
        System.out.println("after closed: " + c7);
    }
}
