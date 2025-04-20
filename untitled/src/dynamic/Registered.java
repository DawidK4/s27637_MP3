package dynamic;

import utils.ObjectPlus;

public class Registered extends AccountUser{
    private String username;
    private String password;

    public Registered(AccountUser prevUser, String username, String password) {
        super(prevUser.email);
        setUsername(username);
        setPassword(password);
        ObjectPlus.removeFromExtent(prevUser);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username must not be null or empty!");
        }

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 5) {
            throw new IllegalArgumentException("Password must contain at least 6 characters!");
        }

        this.password = password;
    }
}
