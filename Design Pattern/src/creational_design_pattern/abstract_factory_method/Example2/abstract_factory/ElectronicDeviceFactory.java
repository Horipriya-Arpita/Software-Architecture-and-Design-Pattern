package creational_design_pattern.abstract_factory_method.Example2.abstract_factory;

import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Laptop;
import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Phone;

public interface ElectronicDeviceFactory {
    Phone createPhone();
    Laptop createLaptop();
}
