package pattern.creational.abstractFactory.gui.concreteFactory;

import pattern.creational.abstractFactory.gui.abstractFactory.GUIFactory;
import pattern.creational.abstractFactory.gui.abstractProducts.Button;
import pattern.creational.abstractFactory.gui.abstractProducts.CheckBox;
import pattern.creational.abstractFactory.gui.concreteProducts.WindowsButton;
import pattern.creational.abstractFactory.gui.concreteProducts.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
