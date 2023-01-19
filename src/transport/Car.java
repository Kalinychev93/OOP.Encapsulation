package transport;

public class Car extends Transport{
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;
    private Key key;

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               double maxSpeed,
               double engineVolume,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean summerTyres,
               Key key) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.transmission = transmission == null || transmission.isBlank() ? "МКПП" : transmission;
        this.bodyType = bodyType == null || bodyType.isBlank() ? "седан" : bodyType;
        this.registrationNumber = registrationNumber == null || registrationNumber.isBlank() ? "а000аа77" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 ? 4 : numberOfSeats;
        this.summerTyres = summerTyres;
        this.key = key == null ? new Car.Key(false, false) : key;
    }

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


    public void changeTyres(int month) {
        if (month >= 4 && month <= 10) {
            summerTyres = true;
        }
        if ((month >= 1 && month <= 3) || (month >= 11 && month <= 12)) {
            summerTyres = false;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
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
        this.registrationNumber = registrationNumber == null || registrationNumber.isBlank() ? "а000аа77" : registrationNumber;
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
        this.key = key == null ? new Car.Key(false, false) : key;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", максимальная скорость: " + maxSpeed + " км/ч." +
                ", мощность двигателя: " + engineVolume +
                ", коробка передач: " + transmission +
                ", тип кузова - " + bodyType +
                ", рег.номер: " + registrationNumber +
                ", количество мест: " + numberOfSeats +
                ", тип резины - " + (summerTyres ? "летняя" : "зимняя") +
                ", " + key;
    }
}


