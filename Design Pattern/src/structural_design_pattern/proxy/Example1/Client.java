package structural_design_pattern.proxy.Example1;

public class Client {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        internet.connectTo("google.com");    // Access allowed, connects to google.com
        internet.connectTo("facebook.com");  // Access blocked, Facebook is in the blocked list
        internet.connectTo("twitter.com");   // Access blocked, Twitter is in the blocked list
        internet.connectTo("example.com");   // Access allowed, connects to example.com
    
    }
}
