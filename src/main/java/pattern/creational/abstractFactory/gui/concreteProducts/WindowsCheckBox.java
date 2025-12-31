package pattern.creational.abstractFactory.gui.concreteProducts;

import pattern.creational.abstractFactory.gui.abstractProducts.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("This is windows checkbox!");
    }
}
