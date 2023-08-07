package creational_design_pattern.factory_method.Example1.concrete_creator;

import creational_design_pattern.factory_method.Example1.concrete_product.Rocky_Asteroids;
import creational_design_pattern.factory_method.Example1.concrete_product.Silicon_Asteroids;
import creational_design_pattern.factory_method.Example1.creator.AsteroidsFactory;
import creational_design_pattern.factory_method.Example1.product.Asteroids;

public class Level2AsteroidsFactory extends AsteroidsFactory{

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 7) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
    
}
