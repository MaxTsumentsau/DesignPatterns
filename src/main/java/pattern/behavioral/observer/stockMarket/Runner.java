package pattern.behavioral.observer.stockMarket;

import pattern.behavioral.observer.stockMarket.publisher.StockMarket;
import pattern.behavioral.observer.stockMarket.subscriber.AggressiveInvestor;
import pattern.behavioral.observer.stockMarket.subscriber.ConservativeInvestor;
import pattern.behavioral.observer.stockMarket.subscriberInterface.Investor;

public class Runner {
    public static void main(String[] args) {
        StockMarket market=new StockMarket();
        Investor aggressiveInvestor1 = new AggressiveInvestor("Ivan");
        Investor aggressiveInvestor2 = new AggressiveInvestor("Eugen");
        Investor conservativeInvestor1 = new ConservativeInvestor("Max");

        market.addInvestor(aggressiveInvestor1);
        market.addInvestor(aggressiveInvestor2);
        market.addInvestor(conservativeInvestor1);

        market.notifyInvestors("AAPL", 120.95);
        market.removeInvestor(aggressiveInvestor2);
        market.notifyInvestors("AAPL", 140.86);
    }
}
