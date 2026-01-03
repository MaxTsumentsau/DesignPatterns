package pattern.behavioral.templateMethod.onlineShopping.abstractMethod;

public abstract class OnlineShopping {
    public final void purchase(){
        selectItems();
        applyDiscount();
        pay();
        deliver();
        thankCostumer();
    }

    protected abstract void selectItems();
    protected abstract void pay();
    protected abstract void deliver();

    protected void applyDiscount(){
        System.out.println("You do not have any discount");
    }

    protected void thankCostumer(){
        System.out.println("Thank you for your purchase");
    }
}
