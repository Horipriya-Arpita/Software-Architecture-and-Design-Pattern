package creational_design_pattern.factory_method.Example1;

import creational_design_pattern.factory_method.Example1.concrete_creator.Level1AsteroidsFactory;
import creational_design_pattern.factory_method.Example1.concrete_creator.Level2AsteroidsFactory;
import creational_design_pattern.factory_method.Example1.creator.AsteroidsFactory;
import creational_design_pattern.factory_method.Example1.product.Asteroids;

public class client {
    public static void main(String[] args) {
        int t = 10;
        int score = 0;
        while(t>0){
            t--;
            score++;
            
            int level;
            if(score<5) level = 1;
            else level = 2;

            System.out.println("........................\n\n"+"level : " + level + "\tscore : " + score +".... \t");

            AsteroidsFactory asteroidsFactory;

            if(level == 1) {
                asteroidsFactory = new Level1AsteroidsFactory();
                Asteroids asteroids = asteroidsFactory.createAsteroids(score);
                asteroids.show();
            }

            else {
                asteroidsFactory = new Level2AsteroidsFactory();
                Asteroids asteroids = asteroidsFactory.createAsteroids(score);
                asteroids.show();
            }
        }
    }
}
