package Transport;

import Driver.Driver;

public class Truck<D extends Driver> extends Transport implements Competing {
    public enum CargoTruck {
        N1 (0,12.0),
        N2 (3.5,12.0),
        N3 (12.0, 0);
        private double min;
        private double max;

        CargoTruck (double min, double max) {
            this.min = min;
            this.max = max;
        }
    }
//    private final CargoTruck[] typeBodyTruck = new CargoTruck[][CargoTruck.values().length];
   private CargoTruck cargoTruck;

    public Truck(String brand, String model, double engineVolume, CargoTruck cargoTruck) {
        super(brand, model, engineVolume);
        this.cargoTruck = cargoTruck;
    }
    //    public String[] getTypeBodyTruck() {
//        return typeBodyTruck;
//    }

    public String[] getCargoTruck() {
        String[] cargoTruck = new String[CargoTruck.values().length];
        for (int i = 0; i < cargoTruck.length; i++) {
            cargoTruck[i] = CargoTruck.values()[i].name();
        }
        return cargoTruck;
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
        return "Truck{} " + super.toString() + " тип кузова- " + cargoTruck;
    }
}



