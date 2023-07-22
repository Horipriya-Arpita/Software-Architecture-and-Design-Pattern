package behavioral_design_pattern.chain_of_responsibility.Example1;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler usernamePasswordHandler = new UsernamePasswordAuthenticationHandler();
        AuthenticationHandler twoFactorHandler = new TwoFactorAuthenticationHandler();
        AuthenticationHandler ipWhitelistingHandler = new IPWhitelistingHandler();

        usernamePasswordHandler.setNext(twoFactorHandler);
        twoFactorHandler.setNext(ipWhitelistingHandler);

        // Simulate user authentication attempts
        User user1 = new User("john", "password", true, "123456", "192.168.1.100");
        User user2 = new User("alice", "pass123", true, "654321", "192.168.1.101");

        boolean isUser1Authenticated = usernamePasswordHandler.authenticate(user1);
        boolean isUser2Authenticated = usernamePasswordHandler.authenticate(user2);

        System.out.println("User1 Authentication Status: " + isUser1Authenticated); // Output: User1 Authentication Status: true
        System.out.println("User2 Authentication Status: " + isUser2Authenticated); // Output: User2 Authentication Status: false
    
    }
}
