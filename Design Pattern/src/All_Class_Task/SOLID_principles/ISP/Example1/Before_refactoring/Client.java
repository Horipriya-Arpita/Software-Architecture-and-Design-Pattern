package All_Class_Task.SOLID_principles.ISP.Example1.Before_refactoring;

public class Client {
    public static void main(String[] args) {
        SocialMedia facebook = new Facebook();
        facebook.post("Hello from Facebook!");
        facebook.connect();
        facebook.chat("Arpita", "Hello Alice!");
        facebook.getFeed();

        System.out.println("__________________");

        SocialMedia twitter = new Twitter();
        twitter.post("Hello from Twitter!");
        twitter.connect();
        twitter.getFeed();

        System.out.println("__________________");

        SocialMedia whatsapp = new WhatsApp();
        whatsapp.connect();
        whatsapp.chat("Horipriya", "Hi Charlie!");
    }
}
