package behavioral_design_pattern.visitor.Example1;

import behavioral_design_pattern.visitor.Example1.concrete_element.Circle;
import behavioral_design_pattern.visitor.Example1.concrete_element.Rectangle;
import behavioral_design_pattern.visitor.Example1.concrete_element.Triangle;
import behavioral_design_pattern.visitor.Example1.concrete_visitor.AreaVisitor;
import behavioral_design_pattern.visitor.Example1.element.Shape;
import behavioral_design_pattern.visitor.Example1.visitor.Visitor;

public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        Visitor areaVisitor = new AreaVisitor();

        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);
        triangle.accept(areaVisitor);

//        Output:
//        Area of Circle: 78.53981633974483
//        Area of Rectangle: 24.0
//        Area of Triangle: 10.5

    }
}
