package structural_design_pattern.bridge.Example1;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing a square ");
        color.applyColor();
    }
}
