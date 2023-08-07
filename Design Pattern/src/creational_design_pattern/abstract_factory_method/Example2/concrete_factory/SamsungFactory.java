package creational_design_pattern.abstract_factory_method.Example2.concrete_factory;

import creational_design_pattern.abstract_factory_method.Example2.abstract_factory.ElectronicDeviceFactory;
import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Laptop;
import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Phone;
import creational_design_pattern.abstract_factory_method.Example2.concrete_product.DellLaptop;
import creational_design_pattern.abstract_factory_method.Example2.concrete_product.SamsungPhone;

public class SamsungFactory implements ElectronicDeviceFactory{

    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new DellLaptop();
    }
    
}
