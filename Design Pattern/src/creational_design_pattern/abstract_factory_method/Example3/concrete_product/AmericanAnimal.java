package creational_design_pattern.abstract_factory_method.Example3.concrete_product;

import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Animal;

public class AmericanAnimal implements Animal{

    public AmericanAnimal(){
        draw();
    }
    
    @Override
    public void draw() {
        System.out.println("drawing American Animal");
    }

}
