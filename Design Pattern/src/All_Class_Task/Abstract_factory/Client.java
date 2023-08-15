package All_Class_Task.Abstract_factory;

import creational_design_pattern.abstract_factory_method.Example1.abstract_factory.ObstacleFactory;
import creational_design_pattern.abstract_factory_method.Example1.concrete_factory.Asteroids.Level1AsteroidsFactory;
import creational_design_pattern.abstract_factory_method.Example1.concrete_factory.Asteroids.Level2AsteroidsFactory;
import creational_design_pattern.abstract_factory_method.Example1.concrete_factory.DebrisField.Level1DebrisFieldFactory;
import creational_design_pattern.abstract_factory_method.Example1.concrete_factory.DebrisField.Level2DebrisFieldFactory;
import creational_design_pattern.abstract_factory_method.Example1.product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        ObstacleFactory factory;

        
        if(level == 1) factory = new Level1AsteroidsFactory();
        else factory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        if(level == 1) factory = new Level1DebrisFieldFactory();
        else factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();
        
    }
}
