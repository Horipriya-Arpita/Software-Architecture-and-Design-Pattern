package creational_design_pattern.factory_method.Example2;

import creational_design_pattern.factory_method.Example2.concrete_creator.ChicagoPizzaStore;
import creational_design_pattern.factory_method.Example2.concrete_creator.NewYorkPizzaStore;
import creational_design_pattern.factory_method.Example2.creator.PizzaStore;
import creational_design_pattern.factory_method.Example2.product.Pizza;

public class Client {
    public static void main(String[] args) {
        PizzaStore newyorkStore = new NewYorkPizzaStore();
        PizzaStore chicagStore = new ChicagoPizzaStore();

        Pizza cheesepizza = newyorkStore.createPizza("cheese");
        cheesepizza.prepare();
        cheesepizza.bake();
        cheesepizza.cut();
        cheesepizza.box();

        System.out.println("");
        Pizza pepperonipizza = chicagStore.createPizza("pepperoni");
        pepperonipizza.prepare();
        pepperonipizza.bake();
        pepperonipizza.cut();
        cheesepizza.box();

    }
}
