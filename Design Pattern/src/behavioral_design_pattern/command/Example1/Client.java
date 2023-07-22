package behavioral_design_pattern.command.Example1;

import behavioral_design_pattern.command.Example1.concrete_command.Command;
import behavioral_design_pattern.command.Example1.concrete_command.OpenCommand;
import behavioral_design_pattern.command.Example1.concrete_command.SaveCommand;
import behavioral_design_pattern.command.Example1.invoker.FileOperationInvoker;
import behavioral_design_pattern.command.Example1.receiver.FileReceiver;

public class Client {
    public static void main(String[] args) {
        // Create the receiver (FileReceiver)
        FileReceiver fileReceiver = new FileReceiver();

        // Create the commands
        Command saveCommand = new SaveCommand(fileReceiver);
        Command openCommand = new OpenCommand(fileReceiver);

        // Create the invoker (FileOperationInvoker)
        FileOperationInvoker fileOperationInvoker = new FileOperationInvoker();

        // Execute save and open commands
        fileOperationInvoker.setCommand(saveCommand);
        fileOperationInvoker.executeCommand(); // Output: File saved successfully!

        fileOperationInvoker.setCommand(openCommand);
        fileOperationInvoker.executeCommand(); // Output: File opened successfully!
    
    }
}
