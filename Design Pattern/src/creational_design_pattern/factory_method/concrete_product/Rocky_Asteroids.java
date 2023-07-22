package creational_design_pattern.factory_method.concrete_product;

import creational_design_pattern.factory_method.product.Asteroids;

public class Rocky_Asteroids implements Asteroids{

    @Override
    public void show() {
        System.out.println("Rocky Asteroids popped...");
    }
    
}
