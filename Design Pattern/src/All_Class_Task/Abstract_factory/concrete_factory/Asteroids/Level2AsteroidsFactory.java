package All_Class_Task.Abstract_factory.concrete_factory.Asteroids;

import creational_design_pattern.abstract_factory_method.Example1.concrete_product.Asteroids.Ice_Asteroids;
import creational_design_pattern.abstract_factory_method.Example1.concrete_product.Asteroids.Iron_Asteroids;
import creational_design_pattern.abstract_factory_method.Example1.product.Obstacle;

public class Level2AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return  new Iron_Asteroids();
    }

}
    
