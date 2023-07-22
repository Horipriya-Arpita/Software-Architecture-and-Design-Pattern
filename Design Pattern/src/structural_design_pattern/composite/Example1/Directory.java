package structural_design_pattern.composite.Example1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem{
    private String name;
    private List<FileSystemItem> items;

    public Directory(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+-- " + name);
        for (FileSystemItem item : items) {
            item.display(indent + "    ");
        }
    }
    
}
