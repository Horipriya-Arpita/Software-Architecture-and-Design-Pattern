package behavioral_design_pattern.chain_of_responsibility.Example1;

public class User {
    private String username;
    private String password;
    private boolean twoFactorEnabled;
    private String twoFactorCode;
    private String ipAddress;


    public User(String username, String password, boolean twoFactorEnabled, String twoFactorCode, String ipAddress) {
        this.username = username;
        this.password = password;
        this.twoFactorEnabled = twoFactorEnabled;
        this.twoFactorCode = twoFactorCode;
        this.ipAddress = ipAddress;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public void setTwoFactorEnabled(boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public String getTwoFactorCode() {
        return twoFactorCode;
    }

    public void setTwoFactorCode(String twoFactorCode) {
        this.twoFactorCode = twoFactorCode;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
