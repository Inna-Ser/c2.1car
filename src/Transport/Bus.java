package Transport;

import Driver.Driver;

public class Bus extends Transport implements Competing {
public enum TypeBody {
    VERY_SMALL(0, 10),
    SMALL(10, 25),
    MEDIUM(40, 50),
    BIG(60, 80),
    VERY_BIG(100, 120);
    private final Integer min;
    private final Integer max;

    TypeBody(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }
}
private TypeBody typeBody;

    public Bus(String brand, String model, double engineVolume,
               TypeBody typeBody) {
        super(brand, model, engineVolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    @Override
    public void printTypeBody() {
        if (typeBody == null) {
            System.out.println(getBrand() + " " + getModel() + " вместимость: - данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBrand() + " " + getModel() + " -  от " + typeBody.min + " до " + typeBody.max + " пассажирских мест.");
        }
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
        return super.toString() + ", тип кузова - " + typeBody;
    }
}

