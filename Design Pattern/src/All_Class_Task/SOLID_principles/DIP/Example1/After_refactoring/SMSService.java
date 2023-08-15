package All_Class_Task.SOLID_principles.DIP.Example1.After_refactoring;

public class SMSService implements MessageService{

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
    
}
