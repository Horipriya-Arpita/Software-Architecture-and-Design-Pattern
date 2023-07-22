package structural_design_pattern.composite.Example1;

public class Client {
    public static void main(String[] args) {
        // Creating files
        FileSystemItem file1 = new File("file1.txt");
        FileSystemItem file2 = new File("file2.txt");
        FileSystemItem file3 = new File("file3.txt");

        // Creating directories and adding files to directories
        Directory subDir1 = new Directory("Subdirectory 1");
        subDir1.addItem(file1);
        subDir1.addItem(file2);

        Directory subDir2 = new Directory("Subdirectory 2");
        subDir2.addItem(file3);

        Directory rootDir = new Directory("Root Directory");
        rootDir.addItem(subDir1);
        rootDir.addItem(subDir2);

        // Display the entire file system structure
        rootDir.display("");
        
    }
}
