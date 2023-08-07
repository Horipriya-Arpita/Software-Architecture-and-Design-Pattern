package creational_design_pattern.factory_method.Example2.concrete_creator;

import creational_design_pattern.factory_method.Example2.concrete_product.CheesePizza;
import creational_design_pattern.factory_method.Example2.concrete_product.PepperoniPizza;
import creational_design_pattern.factory_method.Example2.creator.PizzaStore;
import creational_design_pattern.factory_method.Example2.product.Pizza;

public class ChicagoPizzaStore implements PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            return new PepperoniPizza();
        }
        else{
            throw new IllegalArgumentException("Invalid type of pizza " + type);
        }
    }
    
}
