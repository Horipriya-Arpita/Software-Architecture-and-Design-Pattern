package All_Class_Task.SOLID_principles.SRP.Example1.After_refactoring;

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
    
}
