package oops;

public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(double interest) {
        this.interest = interest;
    }

    public SavingsAccount(int id, double balance, double interest) {
        super(id, balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void addInterest(double interest) {
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "id=" + getId() +
                ", balance=" + getBalance() +
                ", annualInterestRate=" + getAnnualInterestRate() +
                ", dateCreated=" + getDateCreated() +
                ", interest=" + interest +
                '}';
    }
}
