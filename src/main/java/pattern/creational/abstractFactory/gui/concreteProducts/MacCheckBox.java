package pattern.creational.abstractFactory.gui.concreteProducts;

import pattern.creational.abstractFactory.gui.abstractProducts.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("This is mac checkbox!");
    }
}
