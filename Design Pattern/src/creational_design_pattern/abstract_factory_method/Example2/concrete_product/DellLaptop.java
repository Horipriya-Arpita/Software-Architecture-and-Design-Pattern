package creational_design_pattern.abstract_factory_method.Example2.concrete_product;

import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Laptop;

public class DellLaptop implements Laptop{

    @Override
    public void performTask() {
        System.out.println("Performing Task with DellLaptop ... ");
    }
    
}
