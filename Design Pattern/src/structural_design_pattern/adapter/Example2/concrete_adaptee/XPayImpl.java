package structural_design_pattern.adapter.Example2.concrete_adaptee;

import structural_design_pattern.adapter.Example2.adaptee_interface.XPay;

public class XPayImpl implements XPay{

    private String creditCard;
    private double amount;

    @Override
    public String getCreditCard() {
        return creditCard;
    }

    @Override
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public double getAmont() {
        return amount;    
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
