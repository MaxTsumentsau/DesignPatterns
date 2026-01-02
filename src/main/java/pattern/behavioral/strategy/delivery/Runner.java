package pattern.behavioral.strategy.delivery;

import pattern.behavioral.strategy.delivery.concreteStrategy.CourierDelivery;
import pattern.behavioral.strategy.delivery.concreteStrategy.ExpressDelivery;
import pattern.behavioral.strategy.delivery.concreteStrategy.PostDelivery;
import pattern.behavioral.strategy.delivery.context.Order;
import pattern.behavioral.strategy.delivery.interfaceStrategy.DeliveryStrategy;

public class Runner {
    public static void main(String[] args) {
        Order order = new Order(new CourierDelivery());
        order.calculate(500);

        order.setStrategy(new PostDelivery());
        order.calculate(500);

        order.setStrategy(new ExpressDelivery());
        order.calculate(500);
    }
}
