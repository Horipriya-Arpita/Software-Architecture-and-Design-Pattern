package creational_design_pattern.abstract_factory_method.Example2.concrete_factory;

import creational_design_pattern.abstract_factory_method.Example2.abstract_factory.ElectronicDeviceFactory;
import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Laptop;
import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Phone;
import creational_design_pattern.abstract_factory_method.Example2.concrete_product.IPhone;
import creational_design_pattern.abstract_factory_method.Example2.concrete_product.MacBook;

public class AppleFactory implements ElectronicDeviceFactory{

    @Override
    public Phone createPhone() {
        return new IPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
    
}
