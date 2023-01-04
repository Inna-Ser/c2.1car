package Transport;

public abstract class Transport implements Competing {
    public static final String START_MOVE = "Начал движение";
    public static final String FINISH_MOVE = "Закончил движение";
    public static final String PIT_STOP = "Поменял резину";
    //    public static final String[] ACTIONS_COMPETING = {START_MOVE, FINISH_MOVE, PIT_STOP};
//    private String[] actions = new String[ACTIONS_COMPETING.length];
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model,
//                     String color, String productionCountry, int productionYear, int maxSpeed,
                     double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 3.00;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void doStartMove() {
        System.out.println("Автомобиль " + brand + " " + model + " " + START_MOVE);
    }

    public void doFinishMove() {
        System.out.println("Автомобиль " + brand + " " + model + " " + START_MOVE);
    }

    public abstract void printTypeBody();

    // методы класса Competing
    @Override
    public void doPitStop() {
        System.out.println("Автомобиль " + brand + " " + model + " " + PIT_STOP);
    }

    @Override
    public void findMaximumSpeed(int speedCircle1, int speedCircle2) {
        int maximumSpeed;
        if (speedCircle1 >= speedCircle2) {
            System.out.println("Лучшая скорость для " + brand + " " + model + " - " +  speedCircle1 + "км/ч");
        } else {
                System.out.println("Лучшая скорость для " + brand + " " + model + " - " + speedCircle2 + "км/ч");
            }
        }

    @Override
    public void findBestCircleTime(double timeCircle1, double timeCircle2) {
        if (timeCircle1 >= timeCircle2) {
            System.out.println("Лучшее время круга для " + brand + " " + model + " - " + timeCircle2 + "мин.");
        } else {
                System.out.println("Лучшее время круга для " + brand + " " + model + " - " + timeCircle1 + "мин.");
            }
        }

    @Override
    public String toString() {
        return " brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume + "l";
    }

    //   public String changeCheckUp() {
    //       if (isCheckUp == true) {
    //          return "check up passed";
    //      } else
    //          return "check up failed";
    //  }
}
