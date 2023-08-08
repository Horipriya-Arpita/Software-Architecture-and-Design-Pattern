package creational_design_pattern.abstract_factory_method.Example3;

import creational_design_pattern.abstract_factory_method.Example3.abstract_factory.ScenarioFactory;
import creational_design_pattern.abstract_factory_method.Example3.concrete_factory.AfricanScenarioFactory;
import creational_design_pattern.abstract_factory_method.Example3.concrete_factory.AmericanScenarioFactory;
import creational_design_pattern.abstract_factory_method.Example3.concrete_factory.AsianScenarioFactory;

public class Client {
    public static void main(String[] args) {

        ScenarioFactory asianscenarion = new AsianScenarioFactory();
        
        asianscenarion.createTerrain();
        asianscenarion.createTree();
        asianscenarion.createAnimal();

        ScenarioFactory americanscenarion = new AmericanScenarioFactory();
        
        americanscenarion.createTerrain();
        americanscenarion.createTree();
        americanscenarion.createAnimal();


        ScenarioFactory africanscenarion = new AfricanScenarioFactory();
        
        africanscenarion.createTerrain();
        africanscenarion.createTree();
        africanscenarion.createAnimal();



    }
}
