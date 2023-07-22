package behavioral_design_pattern.chain_of_responsibility.Example1;

public class UsernamePasswordAuthenticationHandler implements AuthenticationHandler{
    private AuthenticationHandler nextHandler;

    @Override
    public void setNext(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean authenticate(User user) {
        // Username-Password authentication logic
        if (user.getUsername().equals("john") && user.getPassword().equals("password")) {
            System.out.println("Username-Password authentication successful!");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.authenticate(user);
        } else {
            System.out.println("Username-Password authentication failed!");
            return false;
        }
    }
}
