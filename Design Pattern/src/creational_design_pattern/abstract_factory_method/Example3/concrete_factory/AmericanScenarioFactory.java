package creational_design_pattern.abstract_factory_method.Example3.concrete_factory;

import creational_design_pattern.abstract_factory_method.Example3.abstract_factory.ScenarioFactory;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Animal;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Terrain;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Tree;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AmericanAnimal;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AmericanTerrain;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AmericanTree;

public class AmericanScenarioFactory implements ScenarioFactory{

    @Override
    public Terrain createTerrain() {
        return new AmericanTerrain();
    }

    @Override
    public Tree createTree() {
        return new AmericanTree();
    }

    @Override
    public Animal createAnimal() {
        return new AmericanAnimal();
    }
    
}
