package All_Class_Task.SOLID_principles.ISP.Example1.After_refactoring;

public class WhatsApp implements SocialMedia, Chatable{

    @Override
    public void chat(String friendName, String message) {
        System.out.println("Chatting on WhatsApp with " + friendName + ": " + message);
    }

    @Override
    public void connect() {
        System.out.println("Connected on WhatsApp");
    }
    
}
