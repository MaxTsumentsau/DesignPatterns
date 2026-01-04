package pattern.behavioral.observer.stockMarket.publisher;

import pattern.behavioral.observer.stockMarket.subscriberInterface.Investor;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Investor> investors= new ArrayList<>();

    public void addInvestor(Investor investor){
        investors.add(investor);
    }

    public void removeInvestor(Investor investor){
        investors.remove(investor);
    }

    public void notifyInvestors(String stock, double price){
        for (Investor investor:investors){
            investor.update(stock, price);
        }
    }
}
