package pattern.creational.builder;

import java.util.Objects;

public class Car {
    private final String vin;          // VIN номер
    private final String brand;        // марка
    private final String model;        // модель
    private final int year;            // год выпуска

    private String color = "White";           // цвет
    private String engineType = "Petrol";     // тип двигателя
    private Double engineVolume = null;       // объем двигателя
    private String transmission = "Manual";   // коробка передач
    private Integer mileage = 0;              // пробег
    private Boolean isUsed = false;           // б/у или новый

    //Приватный конструктор для builder
    private Car(CarBuilder builder) {
        this.vin = builder.vin;
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engineType = builder.engineType;
        this.engineVolume = builder.engineVolume;
        this.transmission = builder.transmission;
        this.mileage = builder.mileage;
        this.isUsed = builder.isUsed;
    }

    //Getters
    public String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Boolean getUsed() {
        return isUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(vin, car.vin) && Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) && Objects.equals(color, car.color) &&
                Objects.equals(engineType, car.engineType) && Objects.equals(engineVolume, car.engineVolume) &&
                Objects.equals(transmission, car.transmission) && Objects.equals(mileage, car.mileage) &&
                Objects.equals(isUsed, car.isUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, brand, model, year, color, engineType, engineVolume, transmission, mileage, isUsed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", mileage=" + mileage +
                ", isUsed=" + isUsed +
                '}';
    }

    //Static class for builder
    public static class CarBuilder {
        private String vin;
        private String brand;
        private String model;
        private int year;
        private String color = "White";
        private String engineType = "Petrol";
        private Double engineVolume = null;
        private String transmission = "Manual";
        private Integer mileage = 0;
        private Boolean isUsed = false;

        public CarBuilder vin(String vin) {
            this.vin = vin;
            return this;
        }

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder engineVolume(Double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public CarBuilder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder mileage(Integer mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder isUsed(Boolean isUsed) {
            this.isUsed = isUsed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
