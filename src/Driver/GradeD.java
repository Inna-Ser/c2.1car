package Driver;
import Transport.Bus;
import Transport.Transport;
import Transport.Competing;
public class GradeD extends Driver{
    public GradeD(String fullName,
                  boolean drivingLicense,
                  int drivingExperience) {
        super(fullName, drivingLicense, drivingExperience);
    }

    public void drive(Bus transport) {
        System.out.println(" Водитель " + getFullName() +
                " управляет автомобилем " + transport.getBrand() +
                " " + transport.getModel() + " и будет участвовать в заезде.");
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
