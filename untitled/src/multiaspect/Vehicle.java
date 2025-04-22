package multiaspect;

public abstract class Vehicle {
    private String vin;
    private String model;
    private PowerSource powerSource;

    public Vehicle(String vin, String model, PowerSource powerSource) {
        setVin(vin);
        setModel(model);
        setPowerSource(powerSource);
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if (vin == null || vin.isEmpty()) {
            throw new IllegalArgumentException("VIN must not be null or empty!");
        }
        this.vin = vin;
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

    public PowerSource getPowerSource() {
        return powerSource;
    }

    // Cannot be public because this functionality will cause overlapping inheritance
    private void setPowerSource(PowerSource powerSource) {
        if (powerSource == null) {
            throw new IllegalArgumentException("Power source must not be null!");
        }
        this.powerSource = powerSource;
    }
}
