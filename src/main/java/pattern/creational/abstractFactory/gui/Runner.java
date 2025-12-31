package pattern.creational.abstractFactory.gui;

import pattern.creational.abstractFactory.gui.abstractFactory.GUIFactory;
import pattern.creational.abstractFactory.gui.abstractProducts.Button;
import pattern.creational.abstractFactory.gui.abstractProducts.CheckBox;
import pattern.creational.abstractFactory.gui.concreteFactory.WindowsFactory;

public class Runner {
    public static void main(String[] args) {
        GUIFactory factory;
        factory = new WindowsFactory();

        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckbox();

        button.paint();
        checkBox.paint();
    }
}
