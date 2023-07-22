package structural_design_pattern.flyweight.Example1;

public class FontImpl implements Font{
    private String name;
    private int size;
    private boolean bold;

    public FontImpl(String name, int size, boolean bold) {
        this.name = name;
        this.size = size;
        this.bold = bold;
    }

    @Override
    public void applyFont(String text) {
        System.out.println("Applying font - Name: " + name + ", Size: " + size + ", Bold: " + bold + ", Text: " + text);
    }
}
