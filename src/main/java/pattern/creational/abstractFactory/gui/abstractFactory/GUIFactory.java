package pattern.creational.abstractFactory.gui.abstractFactory;

import pattern.creational.abstractFactory.gui.abstractProducts.Button;
import pattern.creational.abstractFactory.gui.abstractProducts.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckbox();
}
