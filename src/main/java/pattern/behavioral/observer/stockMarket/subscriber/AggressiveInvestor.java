package pattern.behavioral.observer.stockMarket.subscriber;

import pattern.behavioral.observer.stockMarket.subscriberInterface.Investor;

public class AggressiveInvestor implements Investor {
    private String name;

    @Override
    public void update(String stock, double price) {
        System.out.printf("Aggressive investor %s for stock %s react at price %.2f%n", name, stock, price);
    }

    public AggressiveInvestor(String name) {
        this.name = name;
    }
}
