package pattern.behavioral.templateMethod.beverage.abstractMethod;

public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("We are pouring in cup");
    }

    private void boilWater() {
        System.out.println("We are boiling water");
    }


}
