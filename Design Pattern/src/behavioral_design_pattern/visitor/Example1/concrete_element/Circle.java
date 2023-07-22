package behavioral_design_pattern.visitor.Example1.concrete_element;

import behavioral_design_pattern.visitor.Example1.element.Shape;
import behavioral_design_pattern.visitor.Example1.visitor.Visitor;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
