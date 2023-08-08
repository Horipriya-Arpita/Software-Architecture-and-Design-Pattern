package creational_design_pattern.abstract_factory_method.Example3.abstract_factory;

import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Animal;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Terrain;
import creational_design_pattern.abstract_factory_method.Example3.abstract_product.Tree;

public interface ScenarioFactory {
    Terrain createTerrain();
    Tree createTree();
    Animal createAnimal();
}
