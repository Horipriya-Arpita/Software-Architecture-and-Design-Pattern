package structural_design_pattern.bridge.Example1;

public class BlueColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("in Blue.");
    }
}
