package All_Class_Task.Abstract_factory.concrete_factory.DebrisField;

import creational_design_pattern.abstract_factory_method.Example1.concrete_product.DebrisField.Dynamic_DebrisField;
import creational_design_pattern.abstract_factory_method.Example1.concrete_product.DebrisField.Static_DebrisField;
import creational_design_pattern.abstract_factory_method.Example1.product.Obstacle;

public class Level1DebrisFieldFactory extends DebrisFieldFactory{

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Static_DebrisField();
        else return new Dynamic_DebrisField();
        
    }
    
}
