package All_Class_Task.SOLID_principles.ISP.Example1.Before_refactoring;

public class WhatsApp implements SocialMedia{

    @Override
    public void post(String content) {
        // WhatsApp cannot post
    }

    @Override
    public void connect() {
        System.out.println("Connected on WhatsApp");
    }

    @Override
    public void chat(String friendName, String message) {
        System.out.println("Chatting on WhatsApp with " + friendName + ": " + message);
    }

    @Override
    public void getFeed() {
        // WhatsApp has no news feed
    }
    
}
