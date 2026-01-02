package pattern.behavioral.strategy.delivery.context;

import pattern.behavioral.strategy.delivery.interfaceStrategy.DeliveryStrategy;

public class Order {
    private DeliveryStrategy strategy;

    public Order(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(double weight) {
        double cost = strategy.calculateCost(weight);
        System.out.printf("The final price of delivery: %.2f%n", cost);
    }
}
