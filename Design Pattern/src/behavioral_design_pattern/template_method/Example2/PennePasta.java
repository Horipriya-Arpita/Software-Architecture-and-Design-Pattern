package behavioral_design_pattern.template_method.Example2;

public class PennePasta extends PastaTemplate{
    
    @Override
    void addSauce() {
        System.out.println("Adding Alfredo Sauce to spaghetti");

    }

    @Override
    void addProtein() {
        System.out.println("Adding Chicken to the dish");

    }
}
