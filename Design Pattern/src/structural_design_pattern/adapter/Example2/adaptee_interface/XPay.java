package structural_design_pattern.adapter.Example2.adaptee_interface;

public interface XPay {
    String getCreditCard();
    void setCreditCard(String creditCard);
    double getAmont();
    void setAmount(double amount);
}
