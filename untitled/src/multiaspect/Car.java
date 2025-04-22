package multiaspect;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String vin, String model, int numberOfDoors, PowerSource powerSource) {
        super(vin, model, powerSource);
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
