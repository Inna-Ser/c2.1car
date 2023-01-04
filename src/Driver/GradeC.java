package Driver;

import Transport.Truck;
import Transport.Competing;
import Transport.Transport;

public class GradeC extends Driver<Truck> {
    public GradeC(String fullName,
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
