package structural_design_pattern.decorator.Example1;

public class CaramelDecorator implements Coffee{
    
    private Coffee coffee;

    public CaramelDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.7;
    }
    
}
