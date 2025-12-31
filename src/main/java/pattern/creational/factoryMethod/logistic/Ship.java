package pattern.creational.factoryMethod.logistic;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка по морю кораблем!");
    }
}
