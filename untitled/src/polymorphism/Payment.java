package polymorphism;

public abstract class Payment {
    private static int idCounter;
    private int id;
    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.id = idCounter++;
        setAmount(amount);
        setCurrency(currency);
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must not be negative!");
        }

        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        if (currency.isEmpty() || currency == null) {
            throw new IllegalArgumentException("Currency must not be null or empty!");
        }

        if (currency.length() <= 3) {
            throw new IllegalArgumentException("Currency length must not exceed 3 characters!");
        }

        this.currency = currency;
    }

    public abstract void processPayment();
}
