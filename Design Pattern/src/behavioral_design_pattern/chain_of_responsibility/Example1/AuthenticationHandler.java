package behavioral_design_pattern.chain_of_responsibility.Example1;

public interface AuthenticationHandler {
    void setNext(AuthenticationHandler nextHandler);
    boolean authenticate(User user);
}
