package All_Class_Task.SOLID_principles.ISP.Example1.Before_refactoring;

interface SocialMedia {
    void post(String content);

    void connect();

    void chat(String friendName, String message);

    void getFeed();
}
