package pattern.creational.abstractFactory.gui.concreteProducts;

import pattern.creational.abstractFactory.gui.abstractProducts.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is mac button!");
    }
}
