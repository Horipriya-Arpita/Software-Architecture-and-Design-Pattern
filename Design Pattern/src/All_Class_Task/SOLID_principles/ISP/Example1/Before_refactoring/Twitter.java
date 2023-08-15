package All_Class_Task.SOLID_principles.ISP.Example1.Before_refactoring;

public class Twitter implements SocialMedia{

    @Override
    public void post(String content) {
        System.out.println("Posted on Twitter: " + content);
    }

    @Override
    public void connect() {
        System.out.println("Connected on Twitter");
    }

    @Override
    public void chat(String friendName, String message) {
        //Twitter cannot chat
    }

    @Override
    public void getFeed() {
        System.out.println("Fetching Twitter feed...");
    }
    
}
