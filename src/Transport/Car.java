package Transport;

import java.time.LocalDate;
import java.time.Month;

public class Car extends Transport {
    // вложенный класс Key
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean getKeylessAccess() {
            return keylessAccess;
        }

        // методы подбора класса Key
        public String isRemoteEngineStart() {
            if (remoteEngineStart == true) {
                return "remote engine start available";
            } else
                return "remote engine start no";
        }

        public String isKeylessAccess() {
            if (keylessAccess == true) {
                return "keyless entry available";
            } else
                return "keyless entry no";
        }
    }

    // вложенный класс Insurance
    public static class Insurance {
        private static LocalDate termOfInsurance;
        private final int costInsurance;
        private final String numberInsurance;

        public Insurance(LocalDate termOfInsurance, int costInsurance, String numberInsurance) {
            if (termOfInsurance == null) {
                this.termOfInsurance = LocalDate.of(2023, 1, 1);
            } else
                this.termOfInsurance = termOfInsurance;
            if (costInsurance <= 0) {
                this.costInsurance = 12_000;
            } else
                this.costInsurance = costInsurance;
            if (numberInsurance == null) {
                this.numberInsurance = "xx0000000";
            } else
                this.numberInsurance = numberInsurance;
        }

        public LocalDate getTermOfInsurance() {
            return termOfInsurance;
        }

        public int getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            if (checkNumberInsurance() == false) {
                return "xx0000000";
            } else
                return numberInsurance;
        }

        // методы проверки Insurance
        public boolean checkNumberInsurance() {
            if (numberInsurance.length() != 9) {
                return false;
            } else
                return true;
        }
    }

    // поля класса Car
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsCount;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;

    // конструктор класса Car


    public Car(String brand,
               String model,
               String color,
               String productionCountry,
               int productionYear,
               int maxSpeed,
               double engineVolume,
               String transmission,
               String bodyType,
               String registrationNumber,
               int seatsCount,
               boolean summerTires,
               Key key,
               Insurance insurance) {
        super(brand, model, color, productionCountry, productionYear, maxSpeed);

        this.engineVolume = 1.5;
        this.transmission = "manualTransmission";
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "sedan";
        } else {
            this.bodyType = bodyType;
        }
        this.registrationNumber = "x000xx000";
        if (seatsCount <= 0) {
            this.seatsCount = 5;
        } else {
            this.seatsCount = seatsCount;
        }
        this.summerTires = true;
        if (key == null) {
            this.key = new Key(false, false);
        } else
            this.key = key;
        this.insurance = insurance;
    }

    // геттеры и сеттеры класса Car

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume() {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission() {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "manualTransmission";
        } else
            this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean getSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String changeTires() {
        if (LocalDate.now().getMonthValue() >= 4 && LocalDate.now().getMonthValue() <= 11) {
            return "summer tires";
        } else
            return "winter tires";
    }

    public boolean checkRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        } else return true;
    }

    // метод проверки сроков страховки
    public void IsValidInsurance() {
        if (Insurance.termOfInsurance.isBefore(LocalDate.now()) || Insurance.termOfInsurance.isEqual(LocalDate.now())) {
            System.out.println("Для автомобиля " + getBrand() + " " + getModel() + " необходимо срочно обновить страховку");
        } else {
            System.out.println("Страховка для автомобиля " + getBrand() + " действительна до " + Car.Insurance.termOfInsurance);
        }
    }

    @Override
    public String toString() {
        return "Автомобиль марка: " + getBrand() + "; модель: " + getModel() + "; цвет: " + color + "; " +
                "; объем двигателя: " + engineVolume + "; год выпуска: " + getProductionYear() +
                "; страна производитель: " + getProductionCountry() + "; коробка передач: " + transmission +
                "; тип кузоав: " + bodyType + "; регистрационный номер: " + registrationNumber +
                "; количество мест: " + seatsCount + "; тип покрышек: " + changeTires() +
                "; удаленный запуск двигателя: " + getKey().isRemoteEngineStart() +
                "; бесключевой досту: " + getKey().isKeylessAccess() +
                "; срок действия страховки: " + getInsurance().getTermOfInsurance() +
                "; стоимость страховки: " + getInsurance().costInsurance +
                "; номер страховки: " + getInsurance().numberInsurance + "\n" + " ";
    }
}




