package structural_design_pattern.adapter.Example2.concrete_adapter;

import structural_design_pattern.adapter.Example2.adaptee_interface.XPay;
import structural_design_pattern.adapter.Example2.target_interface.PayD;

public class XPayToPayDAdapter implements PayD{

    private XPay xpay;

    public XPayToPayDAdapter(XPay xpay){
        this.xpay = xpay;
    }
    @Override
    public String getCustCardNo() {
        return xpay.getCreditCard();   
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        xpay.setCreditCard(custCardNo);
    }

    @Override
    public double getCardBalance() {
        return xpay.getAmont();
    }

    @Override
    public void setCustCarBalance(double cardBalance) {
        xpay.setAmount(cardBalance);
    }
    
}
