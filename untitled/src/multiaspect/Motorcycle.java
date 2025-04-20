package multiaspect;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String vin, String model, float batteryCapacity, boolean hasSidecar) {
        super(vin, model, batteryCapacity);
        this.hasSidecar = hasSidecar;
    }

    public Motorcycle(String vin, String model, int engineCapacity, boolean hasSidecar) {
        super(vin, model, engineCapacity);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
