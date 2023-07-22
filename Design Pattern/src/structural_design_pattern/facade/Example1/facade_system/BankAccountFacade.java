package structural_design_pattern.facade.Example1.facade_system;

import structural_design_pattern.facade.Example1.complex_subsystem.BankAccount;

public class BankAccountFacade {
    
    private BankAccount account;

    public BankAccountFacade(int accountNumber, double initialBalance) {
        account = new BankAccount(accountNumber, initialBalance);
    }

    public int getAccountNumber() {
        return account.getAccountNumber();
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
    
}
