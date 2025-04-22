package multiaspect;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String vin, String model, boolean hasSidecar, PowerSource powerSource) {
        super(vin, model, powerSource);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
