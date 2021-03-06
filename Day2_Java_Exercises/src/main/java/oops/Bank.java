package oops;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public Bank() {}

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String updateAccounts(List<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if (a instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount)a;
                sa.addInterest(sa.getInterest());
            } else if (a instanceof CurrentAccount) {
                CurrentAccount ca = (CurrentAccount)a;
                if (ca.getBalance() < 0 && ca.getOverDraftLimit() > 0) {
                    System.out.println("Letter sent for Current Account id " + ca.getId() +": This account is in overdraft!");
                }
            } else {
                continue;
            }
        }
        return "Accounts updated.";
    }

    public String openAccount(Account a) {
        accounts.add(a);
        return "New Account created!";
    }

    public String openSavingsAccount(SavingsAccount sa) {
        accounts.add(sa);
        return "New Savings Account created!";
    }

    public String openCurrentAccount(CurrentAccount ca) {
        accounts.add(ca);
        return "New Current Account created!";
    }

    public String closeAccount(Account a) {
        accounts.remove(a);
        a.setId(0);
        a.setBalance(0);
        return "Account closed!";
    }

    public String closeSavingsAccount(SavingsAccount sa) {
        accounts.remove(sa);
        sa.setId(0);
        sa.setBalance(0);
        sa.setInterest(0);
        return "Savings Account closed!";
    }

    public String closeCurrentAccount(CurrentAccount ca) {
        accounts.remove(ca);
        ca.setId(0);
        ca.setBalance(0);
        ca.setOverDraftLimit(0);
        return "Current Account closed!";
    }

    public void payDividendIntoAccount(Account a, double dividend) {
        for(int i = 0; i < accounts.size(); i++) {
            if (a == accounts.get(i)) {
                a.deposit(dividend);
            }
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
