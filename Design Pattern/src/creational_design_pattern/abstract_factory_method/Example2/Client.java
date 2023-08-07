package creational_design_pattern.abstract_factory_method.Example2;

import creational_design_pattern.abstract_factory_method.Example2.abstract_factory.ElectronicDeviceFactory;
import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Laptop;
import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Phone;
import creational_design_pattern.abstract_factory_method.Example2.concrete_factory.AppleFactory;
import creational_design_pattern.abstract_factory_method.Example2.concrete_factory.SamsungFactory;

public class Client {
    public static void main(String[] args) {
        ElectronicDeviceFactory samsungFactory = new SamsungFactory();
        Phone samsungphone = samsungFactory.createPhone();
        Laptop samsunglaptop = samsungFactory.createLaptop();

        samsungphone.makeCall();
        samsunglaptop.performTask();

        System.out.println("");
        
        ElectronicDeviceFactory appleFactory = new AppleFactory();
        Phone iphone = appleFactory.createPhone();
        Laptop macbook = appleFactory.createLaptop();

        iphone.makeCall();
        macbook.performTask();
    }
}
