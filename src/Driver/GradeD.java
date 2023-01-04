package Driver;

import Transport.Bus;
import Transport.Transport;
import Transport.Competing;

public class GradeD extends Driver<Bus> {
    public GradeD(String fullName,
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
