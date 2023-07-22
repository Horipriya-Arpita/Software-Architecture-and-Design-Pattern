package structural_design_pattern.facade.Example1.facade_system;

public class Client {
    public static void main(String[] args) {
        
        // Create a bank account with account number 12345 and initial balance $1000
        BankAccountFacade accountFacade = new BankAccountFacade(12345, 1000);

        // Perform operations using the facade
        accountFacade.deposit(500);
        accountFacade.withdraw(200);

        // Get account information using the facade
        int accountNumber = accountFacade.getAccountNumber();
        double balance = accountFacade.getBalance();

        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        
    }
}
