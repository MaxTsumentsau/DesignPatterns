package pattern.behavioral.strategy.delivery.concreteStrategy;

import pattern.behavioral.strategy.delivery.interfaceStrategy.DeliveryStrategy;

public class CourierDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight) {
        return 300 + weight * 10;
    }
}
