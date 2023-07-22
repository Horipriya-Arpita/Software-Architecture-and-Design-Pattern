package structural_design_pattern.decorator.Example1;

public class Client {
    public static void main(String[] args) {
        // Ordering a basic coffee
        Coffee coffee = new BasicCoffee();
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        // Adding decorators to the coffee
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        //coffee = new CaramelDecorator(coffee);

        System.out.println("\nOrder with extras: " + coffee.getDescription());
        System.out.println("Cost with extras: $" + coffee.getCost());
    }
}
