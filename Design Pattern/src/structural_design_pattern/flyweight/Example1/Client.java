package structural_design_pattern.flyweight.Example1;

public class Client {
    public static void main(String[] args) {
        
        Font font1 = FontFactory.getFont("Arial", 12, false);
        Font font2 = FontFactory.getFont("Times New Roman", 14, false);
        Font font3 = FontFactory.getFont("Arial", 12, false);
        Font font4 = FontFactory.getFont("Arial", 16, true);

        font1.applyFont("Hello");
        font2.applyFont("World");
        font3.applyFont("Flyweight");
        font4.applyFont("Pattern");
        
    }
}
