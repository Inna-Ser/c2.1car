import Driver.Driver;
import Exception.NotPassDiagnosticException;
import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;
import Transport.Mechanic;
import Transport.RepairStation;

import java.util.*;

public class Main {

    public static void main(String[] args) throws NotPassDiagnosticException {
        List<Driver<?>> drivers = new ArrayList<>();
        Driver<Car> alexey = new Driver("Борисов Алексей Вячеславович", "B", 8);
        Driver<Car> roman = new Driver("Кулибин Роман Иванович", "B", 8);
        Driver<Car> mikhail = new Driver("Симонов Михаил Семенович", "B", 10);
        Driver<Car> artem = new Driver("Борисов Артем Алексеевич", "B", 5);
        Driver<Bus> boris = new Driver("Семенов Борис Сергеевич", "D", 15);
        Driver<Bus> sergey = new Driver("Васин Сергей Петрович", "D", 15);
        Driver<Bus> toliy = new Driver("Жул Анатолий Иванович", "D", 9);
        Driver<Bus> vova = new Driver("Дроздов Владимир Михайлови", "D", 10);
        Driver<Truck> gena = new Driver("Турин Евгений Альбертович", "C", 7);
        Driver<Truck> andrey = new Driver("Мурзин Адрей Михалович", "C", 7);
        Driver<Truck> misha = new Driver("Видинеев Михаил Григорьеви", "C", 15);
        Driver<Truck> ruben = new Driver("Горгорян Рубен Арменович", "C", 15);
        System.out.println(" ");

        List<Class<? extends Transport>> mechanics = new ArrayList<>();
        Mechanic potapov = new Mechanic("Николай", "Потапов", Mechanic.Company.CAR);
        potapov.addTypeService(Car.class);
        Mechanic mikhalev = new Mechanic("Иван", "Михалев", Mechanic.Company.BUS);
        mikhalev.addTypeService(Bus.class);
        Mechanic ivanov = new Mechanic("Валерий", "Иванов", Mechanic.Company.TRUCK);
        ivanov.addTypeService(Truck.class);
        Mechanic rogov = new Mechanic("Сергей", "Рогов", Mechanic.Company.ALL);
        rogov.addTypeService(Car.class);
        rogov.addTypeService(Bus.class);
        rogov.addTypeService(Truck.class);
        Mechanic nevsorov = new Mechanic("Виталий", "Невзоров", Mechanic.Company.ALL);
        nevsorov.addTypeService(Car.class);
        nevsorov.addTypeService(Bus.class);
        nevsorov.addTypeService(Truck.class);

        Bus mercedes = new Bus("Mercedes", "Tourismo", 4.8, boris, List.of(ivanov, rogov), Bus.TypeBody.BIG);
        Bus volvo = new Bus("Volvo", "Scania", 3.0, sergey, List.of(mikhalev, rogov), Bus.TypeBody.BIG);
        Bus maz = new Bus("MAZ", "PAZ", 3.6, toliy, List.of(mikhalev, rogov), Bus.TypeBody.SMALL);
        Bus ford = new Bus("Ford", "Transit", 2.2, vova, List.of(mikhalev, rogov), Bus.TypeBody.VERY_BIG);

        Car ladaGranta = new Car("Lada", "Granta", 1.6, alexey, List.of(potapov, nevsorov), Car.TypeBody.HATCHBACK);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, roman, List.of(potapov, nevsorov), Car.TypeBody.COUPE);
        Car bmw = new Car("BMW", "Z8", 3.0, artem, List.of(potapov, nevsorov), Car.TypeBody.UNIVERSAL);
        Car kia = new Car("Kia", "Sportage 4 generation", 2.4, mikhail, List.of(potapov, nevsorov), Car.TypeBody.CROSSOVER);

        Truck freightliner = new Truck("Freightliner", "Cascadia", 14.0, gena, List.of(ivanov, rogov), Truck.TypeBody.N1);
        Truck mack = new Truck("Mack", "600 CXU600", 14.0, andrey, List.of(ivanov, rogov), Truck.TypeBody.N2);
        Truck peterbilt = new Truck("Peterbilt", "379", 14.0, misha, List.of(ivanov, rogov), Truck.TypeBody.N3);
        Truck chevrolet = new Truck("Chevrolet", "С65", 14.0, ruben, List.of(ivanov, rogov), Truck.TypeBody.N2);

        List<Transport> transports = new ArrayList<>();
        transports.add(ladaGranta);
        transports.add(audi);
        transports.add(bmw);
        transports.add(kia);
        transports.add(mercedes);
        transports.add(maz);
        transports.add(volvo);
        transports.add(ford);
        transports.add(freightliner);
        transports.add(mack);
        transports.add(chevrolet);
        transports.add(peterbilt);
        System.out.println(" ");

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
        System.out.println(" ");

        passDiagnostic(bmw, volvo, freightliner);
        System.out.println(" ");

        rogov.makeDiagnostic(mack);
        ivanov.makeDiagnostic(volvo);
        mikhalev.makeDiagnostic(mercedes);
        System.out.println(" ");

        nevsorov.toFixTheVehicle(chevrolet);
        potapov.toFixTheVehicle(bmw);
        System.out.println(" ");

        RepairStation repairStation = new RepairStation();
        repairStation.addTransport(mack);
        repairStation.doMaintenance();
        repairStation.addTransport(bmw);
        repairStation.doMaintenance();
        repairStation.addTransport(mercedes);
        repairStation.doMaintenance();
        System.out.println(" ");

        repairStation.addTransport(List.of(ladaGranta, bmw, volvo, peterbilt, kia, mercedes, chevrolet));

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



