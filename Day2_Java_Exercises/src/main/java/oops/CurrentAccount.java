package oops;

public class CurrentAccount extends Account {

    private double overDraftLimit;

    public CurrentAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public CurrentAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "id=" + getId() +
                ", balance=" + getBalance() +
                ", annualInterestRate=" + getAnnualInterestRate() +
                ", dateCreated=" + getDateCreated() +
                ", overDraftLimit=" + overDraftLimit +
                '}';
    }
}
