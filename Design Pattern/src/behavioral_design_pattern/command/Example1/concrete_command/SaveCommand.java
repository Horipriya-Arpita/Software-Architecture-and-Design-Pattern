package behavioral_design_pattern.command.Example1.concrete_command;

import behavioral_design_pattern.command.Example1.receiver.FileReceiver;

public class SaveCommand implements Command{
    private FileReceiver fileReceiver;

    public SaveCommand(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    @Override
    public void execute() {
        fileReceiver.save();
    }
    
}
