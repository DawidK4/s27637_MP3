package multiaspect;

public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String vin, String model, int cargoCapacity, PowerSource powerSource) {
        super(vin, model, powerSource);
        setCargoCapacity(cargoCapacity);
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity < 0) {
            throw new IllegalArgumentException("Cargo capacity must not be negative!");
        }
        this.cargoCapacity = cargoCapacity;
    }
}
