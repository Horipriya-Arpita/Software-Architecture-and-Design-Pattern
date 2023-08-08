package behavioral_design_pattern.template_method.Example2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Preparing SpaghettiPasta.... ");
        PastaTemplate spaghetti = new SpaghettiPasta();
        spaghetti.preparePasta();

        System.out.println("Preparing PennePasta.... ");
        PastaTemplate penne = new PennePasta();
        penne.preparePasta();
    }
}
