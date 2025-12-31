package pattern.creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .vin("VIN123")
                .brand("Toyota")
                .model("Camry")
                .year(2023)
                .color("Red")
                .engineType("Hybrid")
                .build();
        System.out.println(car1);

        Car car2 = new Car.CarBuilder().build();
        System.out.println(car2);
    }
}
