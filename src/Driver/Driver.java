package Driver;

import Transport.Transport;
import Transport.Competing;

public abstract class Driver<T extends Transport & Competing>  implements Driving {
    private String fullName;
    private boolean drivingLicense;
    private int drivingExperience;

    public Driver(String fullName, boolean drivingLicense, int drivingExperience) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Иванов Иван Иванови";
        } else {
            this.fullName = fullName;
        }
        this.drivingLicense = drivingLicense;
        if (drivingExperience < 0) {
            this.drivingExperience = Math.abs(drivingExperience);
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public String checkDrivingLicense() {
        if (drivingLicense == true) {
            return "в наличии";
        } else
            return "отсутсвуют";
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void doStartMove() {
        System.out.println(Transport.START_MOVE);
    }

    @Override
    public void doFinishMove() {
        System.out.println(Transport.FINISH_MOVE);
    }

    @Override
    public void refuelCar() {
        System.out.println("Заправить автомобиль");
    }
    public void drive(T transport) {
        System.out.println(" Водитель " + getFullName() +
                " управляет автомобилем " + transport.getBrand() +
                " " + transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", drivingLicense='" + checkDrivingLicense() + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
