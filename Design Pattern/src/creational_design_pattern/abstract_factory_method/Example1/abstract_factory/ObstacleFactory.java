package creational_design_pattern.abstract_factory_method.Example1.abstract_factory;

import creational_design_pattern.abstract_factory_method.Example1.product.Obstacle;

public abstract class ObstacleFactory {

    public abstract Obstacle createObstacle(int score);
}
