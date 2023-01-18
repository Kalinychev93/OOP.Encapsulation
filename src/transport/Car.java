package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;

    private Key key;

    public static class Key {
        private final boolean remoteRun;
        private final boolean keylessEntry;

        public Key(boolean remoteRun, boolean keylessEntry) {
            this.remoteRun = remoteRun;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteRun ? "удаленный запуск двигателя" : "без удаленного запуска двигателя") + ", "
                    + (keylessEntry ? "бесключевой доступ" : "бесключевой доступ отсутствует");
        }
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean summerTyres,
               Key key) {
//  для проверки пустой строки использую метод isBlank, т.к. он в отличие от метода isEmpty проверяет еще и пробелы,если в строку передали одни пробелы - программа вернет значение true
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.productionCountry = productionCountry == null || productionCountry.isBlank() ? "default" : productionCountry;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color.isBlank() ? "белый" : color;
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.transmission = transmission == null || transmission.isBlank() ? "МКПП" : transmission;
        this.bodyType = bodyType == null || bodyType.isBlank() ? "седан" : bodyType;
        this.registrationNumber = registrationNumber == null || registrationNumber.isBlank() ? "x000xx99" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 ? 4 : numberOfSeats;
        this.summerTyres = summerTyres;
        this.key = key == null ? new Key(false, false) : key;
    }

    public void changeTyres(int month) {
        if (month >= 4 && month <= 10) {
            summerTyres = true;
        }
        if ((month >= 1 && month <= 3) || (month >= 11 && month <= 12)) {
            summerTyres = false;
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

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null || color.isBlank() ? "белый" : color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null || transmission.isBlank() ? "МКПП" : transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null || registrationNumber.isBlank() ? "x000xx99" : registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key == null ? new Key(false, false) : key;
    }

    @Override
    public String toString() {
        return "Автомобиль:" + brand + ", "
                + "модель:" + model
                + ", объем двигателя: " + engineVolume + " л.,"
                + " цвет; " + color
                + ", год выпуска - " + productionYear
                + ", страна-производитель - " + productionCountry
                + ", коробка передач: " + transmission
                + ", тип кузова - " + bodyType
                + ", регистрационный номер: " + registrationNumber
                + ", количество мест: " + numberOfSeats
                + ", тип резины: " + (summerTyres ? "летняя" : "зимняя")
                + ", " + key;
    }
}
