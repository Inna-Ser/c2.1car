package Transport;

public class Truck extends Transport implements Competing {

    public enum TypeBody {
        N1(0D, 12.0),
        N2(3.5, 12.0),
        N3(12.0, 0D);
        private final double min;
        private final double max;

        TypeBody(double min, double max) {
            this.min = min;
            this.max = max;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }
    }

    private TypeBody typeBody;

    public Truck(String brand, String model, double engineVolume, TypeBody typeBody) {
        super(brand, model, engineVolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    @Override
    public void printTypeBody() {
        if (typeBody == null) {
            System.out.println(getBrand() + " " + getModel() + " - грузопподъемность: - данных по транспортному средству недостаточно");
        } else {
            String min = this.typeBody.min == 0 ? "" : "от " + this.typeBody.min + " тонн.";
            String max = this.typeBody.max == 0 ? "" : " до " + this.typeBody.max + " тонн.";

            System.out.println(getBrand() + " " + getModel() + " - грузопподъемность: " + min + " " + max);
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
    public void passDiagnostic() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " диагностику прошел");
    }

    @Override
    public String toString() {
        return super.toString() + ", тип кузова - " + typeBody;
    }
}



