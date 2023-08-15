package All_Class_Task.SOLID_principles.ISP.Example1.Before_refactoring;

public class Facebook implements SocialMedia{

    @Override
    public void post(String content) {
        System.out.println("Posted on Facebook: " + content);
    }

    @Override
    public void connect() {
        System.out.println("Connected on Facebook");
    }

    @Override
    public void chat(String friendName, String message) {
        System.out.println("Chatting on Facebook with " + friendName + ": " + message);
    }

    @Override
    public void getFeed() {
        System.out.println("Fetching Facebook feed...");
    }
    
}
