package behavioral_design_pattern.visitor.Example1.concrete_element;

import behavioral_design_pattern.visitor.Example1.element.Shape;
import behavioral_design_pattern.visitor.Example1.visitor.Visitor;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
