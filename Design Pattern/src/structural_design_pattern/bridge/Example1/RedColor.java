package structural_design_pattern.bridge.Example1;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("in Red.");
    }
}
