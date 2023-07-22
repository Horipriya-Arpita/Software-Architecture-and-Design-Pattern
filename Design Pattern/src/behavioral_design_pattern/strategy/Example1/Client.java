package behavioral_design_pattern.strategy.Example1;

import behavioral_design_pattern.strategy.Example1.Context.PaymentContext;
import behavioral_design_pattern.strategy.Example1.concrete_strategy.CreditCardPayment;
import behavioral_design_pattern.strategy.Example1.concrete_strategy.PayPalPayment;
import behavioral_design_pattern.strategy.Example1.concrete_strategy.PaymentStrategy;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Use Credit Card Payment Strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.makePayment(100);

        // Use PayPal Payment Strategy
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.makePayment(50);
    }
}
