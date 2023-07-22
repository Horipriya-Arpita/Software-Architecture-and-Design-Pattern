package behavioral_design_pattern.template_method.Example1;

public class Tea extends Beverage{

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
    
}
