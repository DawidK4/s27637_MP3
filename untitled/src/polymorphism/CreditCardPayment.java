package polymorphism;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private LocalDate expiryDate;

    public CreditCardPayment(double amount, String currency, String cardNumber, LocalDate expiryDate) {
        super(amount, currency);
        setCardNumber(cardNumber);
        setExpiryDate(expiryDate);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.isEmpty() || cardNumber == null) {
            throw new IllegalArgumentException("Card number must not be null or empty!");
        }

        if (cardNumber.length() > 20) {
            throw new IllegalArgumentException("Card number must not exceed 20 characters!");
        }

        this.cardNumber = cardNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        String info = "Credit Card Payment: " + getId() + "\n"
                + "Amount: " + getAmount() + " " + getCurrency() + "\n"
                + "Card Number: " + getCardNumber() + "\n"
                + "Expiry Date: " + getExpiryDate() + "\n"
                + "-------------------------\n";

        System.out.println(info);

        try (FileWriter writer = new FileWriter("payments.txt", true)) {
            writer.write(info);
        } catch (IOException e) {
            System.out.println("Failed to save payment info: " + e.getMessage());
        }
    }
}
