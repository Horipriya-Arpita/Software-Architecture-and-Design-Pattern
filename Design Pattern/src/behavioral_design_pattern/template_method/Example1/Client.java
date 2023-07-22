package behavioral_design_pattern.template_method.Example1;

public class Client {
    public static void main(String[] args) {
        
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Preparing tea...");
        tea.prepareBeverage();

        System.out.println("\nPreparing coffee...");
        coffee.prepareBeverage();
        
    }
}
