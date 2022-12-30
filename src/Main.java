import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car.Key key = new Car.Key(false, false);
        Car.Key key1 = new Car.Key(false, true);
        Car.Key key2 = new Car.Key(true, false);
        Car.Key key3 = new Car.Key(true, true);

        Car.Insurance insurance = new Car.Insurance(null, 0, null);

        Car ladaGranta = new Car("Lada", "Granta", "yelow", "Russia", 2015, 0, 1.7, null, null, null, 0, true, key, insurance);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "black", "Germany", 2020, 0, 3.0, null, null, null, 0, true, key3, insurance);
        Car bmw = new Car("BMW", "Z8", "black", "Germany", 2021, 0, 3.0, null, null, null, 0, true, key3, insurance);
        Car kia = new Car("Kia", "Sportage 4 generation", "red", "South Korey", 2018, 0, 2.4, null, null, null, 0, true, key1, insurance);
        Car hyundai = new Car("Hyundai", "Avante", "orange", "South Korey", 2016, 0, 1.6, null, null, null, 0, true, key2, insurance);

        Bas mercedes = new Bas("Mercedes", "Tourismo", "gray", "Germany", 2015, 140, 52, true);
        Bas volvo = new Bas("Volvo", "Scania", "blue", "Sweden", 2013, 160, 42, true);
        Bas maz = new Bas("MAZ", "PAZ", "green", "Belarus", 2014, 140, 59, true);

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

        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(maz);
    }
}