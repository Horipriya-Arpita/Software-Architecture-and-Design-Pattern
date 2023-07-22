package behavioral_design_pattern.visitor.Example1.visitor;

import behavioral_design_pattern.visitor.Example1.concrete_element.Circle;
import behavioral_design_pattern.visitor.Example1.concrete_element.Rectangle;
import behavioral_design_pattern.visitor.Example1.concrete_element.Triangle;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
