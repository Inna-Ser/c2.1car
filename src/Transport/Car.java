package Transport;

import Driver.Driver;

public class Car<D extends Driver> extends Transport implements Competing {
    public enum TypeBody {
        COUPE("Купе"),
        CROSSOVER("Кроссовер"),
        HATCHBACK("Хэтчбек"),
        MINIVAN("Минивен"),
        PICKUP("Пикап"),
        SEDAN("Седан"),
        SUV("Внедорожник"),
        UNIVERSAL("Универсал"),
        VAN ("Фургон");
        private final String type;

        TypeBody(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    private TypeBody typeBody;

    public Car(String brand, String model, double engineVolume, TypeBody typeBody) {
        super(brand, model, engineVolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
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
        return " " + super.toString() + " тип кузова- " + getTypeBody();
    }
}




