package All_Class_Task.SOLID_principles.SRP.Example1.Before_refactoring;

public class User {
    
    private String username;
    private String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void createUserInDatabase() {
        System.out.println("User " + username + " created in the database.");
    }
    
    public boolean validateUser(String username, String password) {
       return username.equals("john_doe") && password.equals("pass123");
    }
    
    public void sendWelcomeEmail() {
        System.out.println("Welcome email sent to ");
    }
    
}
