package behavioral_design_pattern.visitor.Example1.element;

import behavioral_design_pattern.visitor.Example1.visitor.Visitor;

public interface Shape {
    void accept(Visitor visitor);
}
