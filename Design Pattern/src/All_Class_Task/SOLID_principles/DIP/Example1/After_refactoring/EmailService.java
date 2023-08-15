package All_Class_Task.SOLID_principles.DIP.Example1.After_refactoring;

public class EmailService implements MessageService{

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
    
}
