package structural_design_pattern.bridge.Example1;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing a circle ");
        color.applyColor();
    }
}
