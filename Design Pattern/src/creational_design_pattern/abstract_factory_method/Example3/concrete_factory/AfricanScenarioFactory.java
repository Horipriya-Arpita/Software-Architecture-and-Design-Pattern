package creational_design_pattern.abstract_factory_method.Example3.concrete_factory;

import creational_design_pattern.abstract_factory_method.Example3.abstract_factory.ScenarioFactory;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Animal;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Terrain;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Tree;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AfricanAnimal;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AfricanTerrain;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AfricanTree;

public class AfricanScenarioFactory implements ScenarioFactory{

    @Override
    public Terrain createTerrain() {
        return new AfricanTerrain();
    }

    @Override
    public Tree createTree() {
        return new AfricanTree();
    }

    @Override
    public Animal createAnimal() {
        return new AfricanAnimal();
    }
    
}
