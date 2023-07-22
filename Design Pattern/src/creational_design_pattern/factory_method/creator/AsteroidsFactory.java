package creational_design_pattern.factory_method.creator;

import creational_design_pattern.factory_method.product.Asteroids;

public abstract class AsteroidsFactory {
    public abstract Asteroids createAsteroids(int score);
}
