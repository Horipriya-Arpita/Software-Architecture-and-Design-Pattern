package behavioral_design_pattern.chain_of_responsibility.Example1;

public class IPWhitelistingHandler implements AuthenticationHandler{
    private AuthenticationHandler nextHandler;

    @Override
    public void setNext(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean authenticate(User user) {
        // IP Whitelisting authentication logic
        if (user.getIpAddress().equals("192.168.1.100")) {
            System.out.println("IP Whitelisting authentication successful!");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.authenticate(user);
        } else {
            System.out.println("IP Whitelisting authentication failed!");
            return false;
        }
    }
}
