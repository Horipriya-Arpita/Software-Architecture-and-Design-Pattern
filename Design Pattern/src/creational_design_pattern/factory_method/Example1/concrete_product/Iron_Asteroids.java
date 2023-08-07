package creational_design_pattern.factory_method.Example1.concrete_product;

import creational_design_pattern.factory_method.Example1.product.Asteroids;

public class Iron_Asteroids implements Asteroids{

    @Override
    public void show() {
        System.out.println("Iron Asteroids popped...");
    }
    
}
