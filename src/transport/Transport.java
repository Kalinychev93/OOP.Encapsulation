package transport;

public class Transport {
    String brand;
    String model;
    final int productionYear;
    final String productionCountry;
    String color;
    double maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     double maxSpeed) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
        this.model = model == null || model.isBlank() ? "default" : model;
        this.productionYear = productionYear <= 0 ? 2000 : productionYear;
        this.productionCountry = productionCountry == null || productionCountry.isBlank() ? "default" : productionCountry;
        this.color = color == null || color.isBlank() ? "белый" : color;
        this.maxSpeed = maxSpeed <= 0 ? 140 : maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null || brand.isBlank() ? "default" : brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model  == null || model.isBlank() ? "default" : model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null || color.isBlank() ? "белый" : color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed <= 0 ? 140 : maxSpeed;
    }

    @Override
    public String toString() {
        return "Марка автомобиля - " + brand +
                ", модель - " + model +
                ", год выпуска: " + productionYear +
                ", страна производитель: " + productionCountry +
                ", цвет кузова - " + color +
                ", максимальная скорость: " + maxSpeed + " км/ч.";
    }
}