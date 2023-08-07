package creational_design_pattern.factory_method.Example1.concrete_creator;

import creational_design_pattern.factory_method.Example1.concrete_product.Ice_Asteroids;
import creational_design_pattern.factory_method.Example1.concrete_product.Iron_Asteroids;
import creational_design_pattern.factory_method.Example1.creator.AsteroidsFactory;
import creational_design_pattern.factory_method.Example1.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory{

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 3) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
    
}
