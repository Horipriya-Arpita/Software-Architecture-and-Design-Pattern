package All_Class_Task.SOLID_principles.DIP.Example1.Before_refactoring;

public class MessageSender {
    private EmailService emailService;

    public MessageSender() {
        this.emailService = new EmailService();
    }

    public void sendMessage(String recipient, String message) {
        emailService.sendEmail(recipient, message);
    }
}
