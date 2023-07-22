package structural_design_pattern.composite.Example1;

public class File implements FileSystemItem{
    
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "|-- " + name);
    }
    
}
