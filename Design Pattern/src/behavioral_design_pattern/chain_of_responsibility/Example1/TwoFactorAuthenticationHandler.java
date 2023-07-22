package behavioral_design_pattern.chain_of_responsibility.Example1;

public class TwoFactorAuthenticationHandler implements AuthenticationHandler{
    private AuthenticationHandler nextHandler;

    @Override
    public void setNext(AuthenticationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public boolean authenticate(User user) {
        // Two-Factor authentication logic
        if (user.isTwoFactorEnabled() && user.getTwoFactorCode().equals("123456")) {
            System.out.println("Two-Factor authentication successful!");
            return true;
        } else if (nextHandler != null) {
            return nextHandler.authenticate(user);
        } else {
            System.out.println("Two-Factor authentication failed!");
            return false;
        }
    }
}
