package behavioral_design_pattern.visitor.Example1.concrete_element;

import behavioral_design_pattern.visitor.Example1.element.Shape;
import behavioral_design_pattern.visitor.Example1.visitor.Visitor;

public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
