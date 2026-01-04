package pattern.behavioral.observer.stockMarket.subscriber;

import pattern.behavioral.observer.stockMarket.subscriberInterface.Investor;

public class ConservativeInvestor implements Investor {
    private String name;

    public ConservativeInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock, double price) {
        System.out.printf("Conservative investor %s observe stock %s stock with price %.2f%n", name, stock, price);
    }
}
