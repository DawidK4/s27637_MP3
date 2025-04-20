package multiaspect;

public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String vin, String model, float batteryCapacity, int cargoCapacity) {
        super(vin, model, batteryCapacity);
        setCargoCapacity(cargoCapacity);
    }

    public Truck(String vin, String model, int engineCapacity, int cargoCapacity) {
        super(vin, model, engineCapacity);
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
