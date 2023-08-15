package All_Class_Task.SOLID_principles.SRP.Example1.After_refactoring;

public class UserValidator {
    public boolean validateUser(String username, String password) {
        return username.equals("john_doe") && password.equals("pass123");
    }
}
