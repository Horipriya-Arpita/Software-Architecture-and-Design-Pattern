package All_Class_Task.SOLID_principles.SRP.Example1.Before_refactoring;

public class Client {
    
    public static void main(String[] args) {
        User user = new User("john_doe", "pass123");
        
        user.createUserInDatabase();

        if (user.validateUser("john_doe", "pass123")) {
            System.out.println("User credentials are valid.");
        } else {
            System.out.println("Invalid user credentials.");
        }
        
        user.sendWelcomeEmail();

    }
}
