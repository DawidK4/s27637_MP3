package multiaspect;

public abstract class Vehicle {
    private String vin;
    private String model;
    private Float batteryCapacity;
    private Integer engineCapacity;

    public Vehicle(String vin, String model, float batteryCapacity) {
        setVin(vin);
        setModel(model);
        setBatteryCapacity(batteryCapacity);
    }

    public Vehicle(String vin, String model, int engineCapacity) {
        setVin(vin);
        setModel(model);
        setEngineCapacity(engineCapacity);
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        if (engineCapacity < 0) {
            throw new IllegalArgumentException("Engine capacity must not be negative!");
        }

        this.engineCapacity = engineCapacity;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        if (batteryCapacity < 0) {
            throw new IllegalArgumentException("Battery capacity must not be negative!");
        }

        this.batteryCapacity = batteryCapacity;
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if (vin == null || vin.isEmpty()) {
            throw new IllegalArgumentException("Vin number must not be null or empty!");
        }

        this.vin = vin;
    }
}
