package dynamic;

public class Admin extends AccountUser{
    private String name;
    private String password;

    public Admin(AccountUser prevUser, String name, String password) {
        super(prevUser.email);
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty!");
        }

        this.name = name;
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
