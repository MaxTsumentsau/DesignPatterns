package pattern.creational.abstractFactory.gui.concreteFactory;

import pattern.creational.abstractFactory.gui.abstractFactory.GUIFactory;
import pattern.creational.abstractFactory.gui.abstractProducts.Button;
import pattern.creational.abstractFactory.gui.abstractProducts.CheckBox;
import pattern.creational.abstractFactory.gui.concreteProducts.MacButton;
import pattern.creational.abstractFactory.gui.concreteProducts.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
