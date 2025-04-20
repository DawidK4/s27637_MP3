package dynamic;

public abstract class AccountUser {
    protected String email;

    public AccountUser(String email) {
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email must not be null or empty!");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @ character!");
        }

        this.email = email;
    }
}
