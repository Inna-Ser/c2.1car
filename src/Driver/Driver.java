package Driver;
import Exception.IrregularDriveLicenseException;
import Transport.Competing;
import Transport.Transport;

import java.util.*;

public class Driver<T extends Transport & Competing> implements Driving {
    private String fullName;
    private String drivingLicense;
    private int drivingExperience;

    public Driver(String fullName, String drivingLicense, int drivingExperience) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Иванов Иван Иванович";
        } else {
            this.fullName = fullName;
        }
        if (drivingLicense != null || !drivingLicense.isEmpty() || !drivingLicense.isBlank()) {
            if (drivingLicense.equals("B") || drivingLicense.equals("C") || drivingLicense.equals("D")) {
                this.drivingLicense = drivingLicense;
            } else {
                try {
                    throw new IrregularDriveLicenseException("Необходимо корректно указать тип прав!" +
                            toString().toString(), this);
                } catch (IrregularDriveLicenseException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        if (drivingExperience < 0) {
            this.drivingExperience = Math.abs(drivingExperience);
        } else {
        this.drivingExperience = drivingExperience;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
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

    public void toDrive(T transport) {
        System.out.println(" Водитель " + getFullName() +
                " управляет автомобилем " + transport.getBrand() +
                " " + transport.getModel() + " и будет участвовать в заезде.");
    }

    @Override
    public String toString() {
        return  fullName + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", drivingExperience= " + drivingExperience +
                " year";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName) && Objects.equals(drivingLicense, driver.drivingLicense);
    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode() + drivingLicense.hashCode();
        return Objects.hash(fullName, drivingLicense, drivingExperience);
    }
}
