package multiaspect;

public class CombustionPowered extends PowerSource {
    private int engineCapacity;

    public CombustionPowered(int engineCapacity) {
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
}
