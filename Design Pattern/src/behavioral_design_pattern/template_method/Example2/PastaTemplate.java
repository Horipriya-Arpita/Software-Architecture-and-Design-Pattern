package behavioral_design_pattern.template_method.Example2;

public abstract class PastaTemplate {
    
    public void preparePasta(){
        boilWater();
        cookPasta();
        addSauce();
        addProtein();
        garnishPlate();
    }

    void boilWater(){
        System.out.println("Boiling Water");

    }

    void cookPasta(){
        System.out.println("Cooking Water");

    }

    abstract void addSauce();
    abstract void addProtein();

    void garnishPlate(){
        System.out.println("Garnishing the plate");

    }
}
