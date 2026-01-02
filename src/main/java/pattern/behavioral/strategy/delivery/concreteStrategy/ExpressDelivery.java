package pattern.behavioral.strategy.delivery.concreteStrategy;

import pattern.behavioral.strategy.delivery.interfaceStrategy.DeliveryStrategy;

public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weight) {
        return 500 + weight * 20;
    }
}
