package Driver;

import Transport.Car;
import Transport.Transport;
import Transport.Competing;

public class GradeB extends Driver<Car> {
    public GradeB(String fullName,
                  boolean drivingLicense,
                  int drivingExperience) {
        super(fullName, drivingLicense, drivingExperience);
    }

    @Override
    public void doStartMove() {
        super.doStartMove();
    }

    @Override
    public void doFinishMove() {
        super.doFinishMove();
    }

    @Override
    public void refuelCar() {
        super.refuelCar();
    }
}
