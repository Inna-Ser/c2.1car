package Transport;

import Driver.Driver;

public class Bus<D extends Driver>  extends Transport implements Competing {
public enum TypeBody {
    VERY_SMALL("особо малая"),
    SMALL("малая"),
    MEDIUM("средняя"),
    BIG("большая"),
    VERY_BIG("особо большая");
    private final String capacity;

    TypeBody(String capacity) {
        this.capacity = capacity;
    }
}
private TypeBody capacity;

    public Bus(String brand, String model, double engineVolume, TypeBody capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    @Override
    public void findBestCircleTime(double timeCircle1, double timeCircle2) {
        super.findBestCircleTime(timeCircle1, timeCircle2);
    }

    @Override
    public void findMaximumSpeed(int speedCircle1, int speedCircle2) {
        super.findMaximumSpeed(speedCircle1, speedCircle2);
    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString() + "тип кузова- " + capacity;
    }
}

