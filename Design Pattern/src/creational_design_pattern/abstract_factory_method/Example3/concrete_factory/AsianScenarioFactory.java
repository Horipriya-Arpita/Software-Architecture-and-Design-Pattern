package creational_design_pattern.abstract_factory_method.Example3.concrete_factory;

import creational_design_pattern.abstract_factory_method.Example3.abstract_factory.ScenarioFactory;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Animal;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Terrain;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Tree;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AsianAnimal;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AsianTerrain;
import creational_design_pattern.abstract_factory_method.Example3.concrete_product.AsianTree;

public class AsianScenarioFactory implements ScenarioFactory{

    @Override
    public Terrain createTerrain() {
        return new AsianTerrain();
    }

    @Override
    public Tree createTree() {
        return new AsianTree();
    }

    @Override
    public Animal createAnimal() {
        return new AsianAnimal();
    }
    
}
