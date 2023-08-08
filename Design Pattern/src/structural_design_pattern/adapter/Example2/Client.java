package structural_design_pattern.adapter.Example2;

import structural_design_pattern.adapter.Example2.adaptee_interface.XPay;
import structural_design_pattern.adapter.Example2.concrete_adaptee.XPayImpl;
import structural_design_pattern.adapter.Example2.concrete_adapter.XPayToPayDAdapter;
import structural_design_pattern.adapter.Example2.target_interface.PayD;

public class Client {
    public static void main(String[] args) {
        XPay xpay = new XPayImpl();
        xpay.setCreditCard("12345678");
        xpay.setAmount(100.00);

        PayD payd = new XPayToPayDAdapter(xpay);
        System.out.println("PayD Card Number is " + payd.getCustCardNo());
        System.out.println("PayD Card Balance is " + payd.getCardBalance());
    }
}
