package pattern.behavioral.strategy.delivery.concreteStrategy;

import pattern.behavioral.strategy.delivery.interfaceStrategy.DeliveryStrategy;

public class PostDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight * 5;
    }
}
