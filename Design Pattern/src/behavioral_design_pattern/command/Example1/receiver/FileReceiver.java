package behavioral_design_pattern.command.Example1.receiver;

public class FileReceiver {
    public void save() {
        System.out.println("File saved successfully!");
    }

    public void open() {
        System.out.println("File opened successfully!");
    }
}
