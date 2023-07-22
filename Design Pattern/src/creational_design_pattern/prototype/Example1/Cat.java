package creational_design_pattern.prototype.Example1;

public class Cat implements Animal{
    
    private String name;
    private String color;

    public Cat(String name, String color) {
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
        System.out.println("Meow! I'm a " + color + " cat named " + name);
    }

    @Override
    public Animal clone() {
        return new Cat(name, color);
    }

}
