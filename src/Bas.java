import Transport.Transport;

public class Bas extends Transport {
    private int numSeatsPlaces;
    private boolean isCheckUp;

    public Bas(String brand,
               String model,
               String color,
               String productionCountry,
               int productionYear,
               int maxSpeed,
               int numSeatsPlaces,
               boolean isCheckUp) {
        super(brand, model, color, productionCountry, productionYear, maxSpeed);
        if (numSeatsPlaces == 0) {
            this.numSeatsPlaces = 52;
        } else
            this.numSeatsPlaces = numSeatsPlaces;
        this.isCheckUp = false;
    }

    public int getNumSeatsPlaces() {
        return numSeatsPlaces;
    }

    public boolean getIsCheckUp() {
        return isCheckUp;
    }

    public void setCheckUp(boolean checkUp) {
        isCheckUp = checkUp;
    }

    public String changeCheckUp() {
        if (isCheckUp == true) {
            return "check up passed";
        } else
            return "check up failed";
    }
    @Override
    public String toString() {
        return "Bas{" +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + color + '\'' +
                ", productionCountry='" + getProductionCountry() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", maxSpeed=" + maxSpeed +
                ", numSeatsPlaces=" + numSeatsPlaces +
                ", isCheckUp =" + changeCheckUp() + '}';
    }
}
