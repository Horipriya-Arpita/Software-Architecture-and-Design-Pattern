package behavioral_design_pattern.command.Example1.invoker;

import behavioral_design_pattern.command.Example1.concrete_command.Command;

public class FileOperationInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
