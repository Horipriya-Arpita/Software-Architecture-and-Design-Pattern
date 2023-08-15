package All_Class_Task.SOLID_principles.DIP.Example1.Before_refactoring;

public class Client {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        sender.sendMessage("recipient@example.com", "Hello, this is a message.");

    }
}
