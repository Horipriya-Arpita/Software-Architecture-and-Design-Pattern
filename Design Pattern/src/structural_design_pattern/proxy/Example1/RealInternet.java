package structural_design_pattern.proxy.Example1;

public class RealInternet implements Internet{
    
    @Override
    public void connectTo(String website) {
        System.out.println("Connecting to " + website);
    }
    
}
