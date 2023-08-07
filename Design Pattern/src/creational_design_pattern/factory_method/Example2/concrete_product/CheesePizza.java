package creational_design_pattern.factory_method.Example2.concrete_product;

import creational_design_pattern.factory_method.Example2.product.Pizza;

public class CheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Pizza...");
    }
    
}
