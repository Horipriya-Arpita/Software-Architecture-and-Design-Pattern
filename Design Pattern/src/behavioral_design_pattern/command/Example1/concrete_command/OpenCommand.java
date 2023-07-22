package behavioral_design_pattern.command.Example1.concrete_command;

import behavioral_design_pattern.command.Example1.receiver.FileReceiver;

public class OpenCommand implements Command{
    private FileReceiver fileReceiver;

    public OpenCommand(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    @Override
    public void execute() {
        fileReceiver.open();
    }
}
