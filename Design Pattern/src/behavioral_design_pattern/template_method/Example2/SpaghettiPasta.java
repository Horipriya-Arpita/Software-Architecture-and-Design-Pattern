package behavioral_design_pattern.template_method.Example2;

public class SpaghettiPasta extends PastaTemplate{

    @Override
    void addSauce() {
        System.out.println("Adding Tomato Sauce to spaghetti");

    }

    @Override
    void addProtein() {
        System.out.println("Adding Meatballs to the dish");

    }
    
}
