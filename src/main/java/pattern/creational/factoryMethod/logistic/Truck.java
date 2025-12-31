package pattern.creational.factoryMethod.logistic;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка по дороге грузовиком!");
    }
}
