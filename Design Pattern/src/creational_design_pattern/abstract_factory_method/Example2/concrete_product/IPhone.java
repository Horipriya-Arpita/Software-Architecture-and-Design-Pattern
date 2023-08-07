package creational_design_pattern.abstract_factory_method.Example2.concrete_product;

import creational_design_pattern.abstract_factory_method.Example2.abstract_product.Phone;

public class IPhone implements Phone {

    @Override
    public void makeCall() {
        System.out.println("Making Phone call with IPhone ... ");
    }
    
}
