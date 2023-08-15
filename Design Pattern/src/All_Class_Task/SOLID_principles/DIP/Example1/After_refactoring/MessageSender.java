package All_Class_Task.SOLID_principles.DIP.Example1.After_refactoring;

public class MessageSender {
    private MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String recipient, String message) {
        messageService.sendMessage(recipient, message);
    }
}
