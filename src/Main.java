import Transport.Car;
import com.sun.jdi.connect.Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car.Key key = new Car.Key(false, false);
        Car.Key key1 = new Car.Key(false, true);
        Car.Key key2 = new Car.Key(true, false);
        Car.Key key3 = new Car.Key(true, true);

        Car.Insurance insurance = new Car.Insurance(null,0, null);
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", null, null, null, 0, true, key, insurance);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", null, null, null, 0, true, key3, insurance);
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", null, null, null, 0, true, key3, insurance);
        Car kia = new Car("Kia", "Sportage 4 generation", 2.4, "red", 2018, "South Korey", null, null, null, 0, true, key1, insurance);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korey", null, null, null, 0, true, key2, insurance);

        System.out.println(ladaGranta);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        ladaGranta.IsValidInsurance();
        audi.IsValidInsurance();
        bmw.IsValidInsurance();
        kia.IsValidInsurance();
        hyundai.IsValidInsurance();
    }
}