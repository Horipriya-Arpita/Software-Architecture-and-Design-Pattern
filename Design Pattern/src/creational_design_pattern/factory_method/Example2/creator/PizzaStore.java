package creational_design_pattern.factory_method.Example2.creator;

import creational_design_pattern.factory_method.Example2.product.Pizza;

public interface PizzaStore {
    Pizza createPizza(String type);
}
