import Driver.Driver;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;
import Driver.GradeB;
import Driver.GradeC;
import Driver.GradeD;
public class Main {
    public static void main(String[] args) {

        Bus mercedes = new Bus("Mercedes", "Tourismo", 4.8);
        Bus volvo = new Bus("Volvo", "Scania", 3.0);
        Bus maz = new Bus("MAZ", "PAZ", 3.6);
        Bus ford = new Bus("Ford", "Transit", 2.2);

        Car ladaGranta = new Car("Lada", "Granta", 1.6);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "Sportage 4 generation", 2.4);

        Truck freightliner = new Truck("Freightliner", "Cascadia", 14.0);
        Truck mack = new Truck("Mack", "600 CXU600", 14.0);
        Truck peterbilt = new Truck("peterbilt", "379", 14.0);
        Truck chevrolet = new Truck("Chevrolet", "С65", 14.0);

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
        volvo.FindBestCircleTime(2.5, 2.1);
        kia.findMaximumSpeed(154, 149);

        System.out.println(" ");
        GradeB<Car> roman = new GradeB<Car>("Пискунов Роман Алексеевич", true, 12);
        GradeD<Bus> sergey = new GradeD<Bus>("Малышев Сергей Витальевич", true, 15);
        GradeC<Truck> andrey = new GradeC<Truck>("Коломин Андрей Иванович", true, 10);

        System.out.println(" ");
        System.out.println(roman);
        System.out.println(sergey);
        System.out.println(andrey);

        System.out.println(" ");
        roman.drive(audi);
        sergey.drive(ford);
        andrey.drive(chevrolet);
    }
}