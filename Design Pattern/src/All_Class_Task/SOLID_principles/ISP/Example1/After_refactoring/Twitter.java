package All_Class_Task.SOLID_principles.ISP.Example1.After_refactoring;

public class Twitter implements SocialMedia, Postable, NewsFeedable{

    @Override
    public void getFeed() {
        System.out.println("Fetching Twitter feed...");
    }

    @Override
    public void post(String content) {
        System.out.println("Posted on Twitter: " + content);
    }

    @Override
    public void connect() {
        System.out.println("Connected on Twitter");
    }
    
}
