package creational_design_pattern.abstract_factory_method.Example3.concrete_product;

import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Terrain;

public class AfricanTerrain implements Terrain{

    public AfricanTerrain(){
        draw();
    }
    
    @Override
    public void draw() {
        System.out.println("drawing African Terrain");
    }
    
}
