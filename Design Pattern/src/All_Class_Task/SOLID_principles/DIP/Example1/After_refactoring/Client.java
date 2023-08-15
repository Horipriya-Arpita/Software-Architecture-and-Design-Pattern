package All_Class_Task.SOLID_principles.DIP.Example1.After_refactoring;

public class Client {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        MessageSender senderWithEmail = new MessageSender(emailService);
        MessageSender senderWithSMS = new MessageSender(smsService);

        senderWithEmail.sendMessage("horipriya@gmail.com", "Hello, this is an email message.");
        senderWithSMS.sendMessage("01726899607", "Hello, this is an SMS message.");
    
    }
}
