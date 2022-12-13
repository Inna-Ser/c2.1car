public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Автомобиль марка: " + brand + "; модель: " + model + "; объем двигателя: " + engineVolume + "; год выпуска: " + productionYear + "; страна производитель: " + productionCountry + "\n" + " ";
    }
}
