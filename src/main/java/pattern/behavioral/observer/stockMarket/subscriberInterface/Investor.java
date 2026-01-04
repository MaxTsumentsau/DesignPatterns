package pattern.behavioral.observer.stockMarket.subscriberInterface;

public interface Investor {
    void update(String stock, double price);
}
