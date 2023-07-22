package behavioral_design_pattern.strategy.Example1.concrete_strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;


    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Credit Card: " + cardNumber);
    }
}
