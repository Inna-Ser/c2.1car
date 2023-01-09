import Driver.Driver;
import Exception.NotPassDiagnosticException;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;

public class Main {
    public static void main(String[] args) throws NotPassDiagnosticException {

        Bus mercedes = new Bus("Mercedes", "Tourismo", 4.8, Bus.TypeBody.BIG);
        Bus volvo = new Bus("Volvo", "Scania", 3.0, null);
        Bus maz = new Bus("MAZ", "PAZ", 3.6, Bus.TypeBody.SMALL);
        Bus ford = new Bus("Ford", "Transit", 2.2, Bus.TypeBody.VERY_BIG);

        Car ladaGranta = new Car("Lada", "Granta", 1.6, Car.TypeBody.HATCHBACK);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.TypeBody.COUPE);
        Car bmw = new Car("BMW", "Z8", 3.0, null);
        Car kia = new Car("Kia", "Sportage 4 generation", 2.4, Car.TypeBody.CROSSOVER);

        Truck freightliner = new Truck("Freightliner", "Cascadia", 14.0, null);
        Truck mack = new Truck("Mack", "600 CXU600", 14.0, Truck.TypeBody.N2);
        Truck peterbilt = new Truck("Peterbilt", "379", 14.0, Truck.TypeBody.N3);
        Truck chevrolet = new Truck("Chevrolet", "С65", 14.0, Truck.TypeBody.N2);

        System.out.println("Bus" + mercedes);
        System.out.println("Bus" + volvo);
        System.out.println("Bus" + maz);
        System.out.println("Bus" + ford);

        System.out.println(" ");
        System.out.println("Car" + ladaGranta);
        System.out.println("Car" + audi);
        System.out.println("Car" + bmw);
        System.out.println("Car" + kia);

        System.out.println(" ");
        System.out.println("Truck" + freightliner);
        System.out.println("Truck" + mack);
        System.out.println("Truck" + peterbilt);
        System.out.println("Truck" + chevrolet);

        System.out.println(" ");
        mercedes.doPitStop();
        bmw.doStartMove();
        chevrolet.doFinishMove();

        System.out.println(" ");
        volvo.findBestCircleTime(2.5, 2.1);
        kia.findMaximumSpeed(154, 149);

        System.out.println(" ");
//        GradeB roman = new GradeB("Пискунов Роман Алексеевич", true, 12);
//        GradeB sergey = new GradeB("Малышев Сергей Витальевич", true, 15);
//        GradeC andrey = new GradeC("Коломин Андрей Иванович", true, 10);
        Driver<Car> roman = new Driver("Пискунов Роман Алексеевич", "", 12);
        Driver<Bus> sergey = new Driver("Малышев Сергей Витальевич", "C", 15);
        Driver<Truck> andrey = new Driver("Коломин Андрей Иванович", "H", 10);

        System.out.println(" ");
        System.out.println(roman);
        System.out.println(sergey);
        System.out.println(andrey);

        System.out.println(" ");
        roman.drive(audi);
        sergey.drive(volvo);
        andrey.drive(chevrolet);
        System.out.println(" ");

        maz.printTypeBody();
        peterbilt.printTypeBody();
        mack.printTypeBody();
        ford.printTypeBody();
        ladaGranta.printTypeBody();
        freightliner.printTypeBody();
        volvo.printTypeBody();
        bmw.printTypeBody();

        passDiagnostic(bmw, volvo, freightliner);


    }

    public static void passDiagnostic(Transport... transports) {
        for (Transport transport : transports)
            try {
                transport.passDiagnostic();
            } catch (NotPassDiagnosticException e) {
                System.out.println("произошла ошибка с атомобилем " + e.getTransport().getModel());
                System.out.println(e.getMessage());
            }
    }
}