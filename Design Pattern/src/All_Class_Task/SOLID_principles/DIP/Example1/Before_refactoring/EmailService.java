package All_Class_Task.SOLID_principles.DIP.Example1.Before_refactoring;

public class EmailService {
    public void sendEmail(String recipient, String message) {
        // Code to send an email
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
