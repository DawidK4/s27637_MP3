package polymorphism;

import java.io.FileWriter;
import java.io.IOException;

public class PayPalPayment extends Payment{
    private String email;

    public PayPalPayment(double amount, String currency, String email) {
        super(amount, currency);
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty() || email == null) {
            throw new IllegalArgumentException("Email must not be null or empty!");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @ sign!");
        }

        this.email = email;
    }

    @Override
    public void processPayment() {
        String info = "PayPal Payment: " + getId() + "\n"
                + "Amount: " + getAmount() + " " + getCurrency() + "\n"
                + "Email: " + getEmail() + "\n"
                + "-------------------------\n";

        System.out.println(info);

        try (FileWriter writer = new FileWriter("payments.txt", true)) {
            writer.write(info);
        } catch (IOException e) {
            System.out.println("Failed to save payment info: " + e.getMessage());
        }
    }
}
