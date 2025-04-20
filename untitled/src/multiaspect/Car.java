package multiaspect;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String vin, String model, float batteryCapacity, int numberOfDoors) {
        super(vin, model, batteryCapacity);
        setNumberOfDoors(numberOfDoors);
    }

    public Car(String vin, String model, int engineCapacity, int numberOfDoors) {
        super(vin, model, engineCapacity);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors < 0) {
            throw new IllegalArgumentException("Number of doors must not be negative!");
        }

        this.numberOfDoors = numberOfDoors;
    }
}
