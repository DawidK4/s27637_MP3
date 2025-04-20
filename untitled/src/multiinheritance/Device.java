package multiinheritance;

public abstract class Device {
    private String brand;
    private String model;
    private String serialNumber;

    public Device(String brand, String model, String serialNumber) {
        setBrand(brand);
        setModel(model);
        setSerialNumber(serialNumber);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand must not be null or empty!");
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model must not be null or empty!");
        }

        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber == null || serialNumber.isEmpty()) {
            throw new IllegalArgumentException("Serial number must not be null or empty!");
        }

        this.serialNumber = serialNumber;
    }

    public void powerOn() {
        System.out.println("Powering on " + brand + " " + model);
    }

    public void powerOff() {
        System.out.println("Shutting down " + brand + " " + model);
    }
}
