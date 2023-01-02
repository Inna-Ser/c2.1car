package Driver;
import Transport.Truck;
import Transport.Competing;
import Transport.Transport;
public class GradeC <T extends Transport & Competing> extends Driver{
    public GradeC(String fullName,
                  boolean drivingLicense,
                  int drivingExperience) {
        super(fullName, drivingLicense, drivingExperience);
    }

    public void drive(Truck transport) {
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
