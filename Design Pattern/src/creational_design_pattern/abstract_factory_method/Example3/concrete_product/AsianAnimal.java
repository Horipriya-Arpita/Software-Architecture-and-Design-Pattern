package creational_design_pattern.abstract_factory_method.Example3.concrete_product;

import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Animal;

public class AsianAnimal implements Animal{

    public AsianAnimal(){
        draw();
    }
    @Override
    public void draw() {
        System.out.println("drawing Asian Animal");
    }

}
