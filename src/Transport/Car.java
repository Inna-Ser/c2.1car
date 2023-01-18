package Transport;

import Driver.Driver;
import java.util.List;

public class Car extends Transport implements Competing {
    public enum TypeBody {
        COUPE("Купе"),
        CROSSOVER("Кроссовер"),
        HATCHBACK("Хэтчбек"),
        MINIVAN("Минивен"),
        PICKUP("Пикап"),
        SEDAN("Седан"),
        SUV("Внедорожник"),
        UNIVERSAL("Универсал"),
        VAN("Фургон");
        private final String type;

        TypeBody(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    private TypeBody typeBody;

    public Car(String brand, String model, double engineVolume, Driver<Car> drivers, List<Mechanic> mechanics, TypeBody typeBody) {
        super(brand, model, engineVolume, drivers, mechanics);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    @Override
    public void printTypeBody() {
        if (typeBody == null) {
            System.out.println(getBrand() + " " + getModel() + " тип кузова: - данных по транспортному средству недостаточно.");
        } else
            System.out.println(getBrand() + " " + getModel() + " - тип кузова: " + typeBody);
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
    public void passDiagnostic() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " диагностику прошел");
    }

    @Override
    public void toDoDiagnostic() {
        System.out.println(Transport.MAKE_DIAGNOSTICS);
    }

    @Override
    public void toFixTheVehicle() {
        System.out.println(Transport.FIX_THE_VEHICLE);
    }

    @Override
    public String toString() {
        return super.toString() + ", тип кузова= " + typeBody
                + "\n   driver= " + getDrivers()
                +"\n   mechanic= " + getMechanics();
    }
}





