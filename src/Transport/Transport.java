package Transport;

import Exception.NotPassDiagnosticException;

import Driver.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;

    private final Driver<?> drivers;
    private List<Mechanic> mechanics;

    public Transport(String brand, String model, double engineVolume, Driver<?> drivers, List<Mechanic> mechanics) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.drivers = drivers;
        this.mechanics = mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Driver getDrivers() {
        return drivers;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(ArrayList<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public void addMechanic(Mechanic mechanics) {
        this.mechanics.add(mechanics);
    }

    public void doStartMove() {
        System.out.println("Автомобиль " + brand + " " + model + START_MOVE);
    }

    public void doFinishMove() {
        System.out.println("Автомобиль " + brand + " " + model + " " + START_MOVE);
    }

    @Override
    public void doPitStop() {
        System.out.println("Автомобиль " + brand + " " + model + " " + PIT_STOP);
    }

    public void printTypeBody() {
    }

    public void passDiagnostic() throws NotPassDiagnosticException {
        System.out.println("Автомобиль " + brand + " " + model + " диагностику прошел");
    }

    @Override
    public void findMaximumSpeed(int speedCircle1, int speedCircle2) {
        int maximumSpeed;
        if (speedCircle1 >= speedCircle2) {
            System.out.println("Лучшая скорость для " + brand + " " + model + " - " + speedCircle1 + "км/ч");
        } else {
            System.out.println("Лучшая скорость для " + brand + " " + model + " - " + speedCircle2 + "км/ч");
        }
    }

    @Override
    public void findBestCircleTime(double timeCircle1, double timeCircle2) {
        if (timeCircle1 >= timeCircle2) {
            System.out.println("Лучшее время круга для " + brand + " " + model + " - " + timeCircle2 + "мин.");
        } else {
            System.out.println("Лучшее время круга для " + brand + " " + model + " - " + timeCircle1 + "мин.");
        }
    }

    @Override
    public String toString() {
        return " brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume + "l";
    }

    //   public String changeCheckUp() {
    //       if (isCheckUp == true) {
    //          return "check up passed";
    //      } else
    //          return "check up failed";
    //  }
}
