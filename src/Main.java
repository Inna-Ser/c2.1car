import Driver.Driver;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;
import Driver.GradeB;
import Driver.GradeC;
import Driver.GradeD;
public class Main {
    public static void main(String[] args) {

        Bus mercedes = new Bus("Mercedes", "Tourismo", 4.8, Bus.TypeBody.BIG);
        Bus volvo = new Bus("Volvo", "Scania", 3.0, Bus.TypeBody.MEDIUM);
        Bus maz = new Bus("MAZ", "PAZ", 3.6, Bus.TypeBody.SMALL);
        Bus ford = new Bus("Ford", "Transit", 2.2, Bus.TypeBody.VERY_BIG);

        Car ladaGranta = new Car("Lada", "Granta", 1.6, Car.TypeBody.HATCHBACK);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, Car.TypeBody.COUPE);
        Car bmw = new Car("BMW", "Z8", 3.0, Car.TypeBody.UNIVERSAL);
        Car kia = new Car("Kia", "Sportage 4 generation", 2.4, Car.TypeBody.CROSSOVER);

//        Truck freightliner = new Truck("Freightliner", "Cascadia", 14.0);
//        Truck mack = new Truck("Mack", "600 CXU600", 14.0);
//        Truck peterbilt = new Truck("peterbilt", "379", 14.0, 10, 10);
//        Truck chevrolet = new Truck("Chevrolet", "С65", 14.0, 0.0, 3.5);
//
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
//        System.out.println("Truck" + freightliner);
//        System.out.println("Truck" + mack);
//        System.out.println("Truck" + peterbilt);
//        System.out.println("Truck" + chevrolet);

        System.out.println(" ");
        mercedes.doPitStop();
        bmw.doStartMove();
//        chevrolet.doFinishMove();

        System.out.println(" ");
        volvo.findBestCircleTime(2.5, 2.1);
        kia.findMaximumSpeed(154, 149);

        System.out.println(" ");
        GradeB roman = new GradeB ("Пискунов Роман Алексеевич", true, 12);
        GradeB sergey = new GradeB ("Малышев Сергей Витальевич", true, 15);
        GradeC andrey = new GradeC ("Коломин Андрей Иванович", true, 10);

        System.out.println(" ");
        System.out.println(roman);
        System.out.println(sergey);
        System.out.println(andrey);

        System.out.println(" ");
        roman.drive(audi);
        sergey.drive(ladaGranta);
//        andrey.drive(chevrolet);
    }
}