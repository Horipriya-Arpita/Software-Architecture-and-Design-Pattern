package creational_design_pattern.factory_method.Example1.creator;

import creational_design_pattern.factory_method.Example1.product.Asteroids;

public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}
