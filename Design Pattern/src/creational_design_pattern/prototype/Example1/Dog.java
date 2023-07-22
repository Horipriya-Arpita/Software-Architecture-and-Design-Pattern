package creational_design_pattern.prototype.Example1;

public class Dog implements Animal{
    
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void speak() {
        System.out.println("Woof! I'm a " + color + " dog named " + name);
    }

    @Override
    public Animal clone() {
        return new Dog(name, color);
    }
}
