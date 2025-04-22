package multiaspect;

public class ElectricPowered extends PowerSource {
    private float batteryCapacity;

    public ElectricPowered(float batteryCapacity) {
        setBatteryCapacity(batteryCapacity);
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
}
