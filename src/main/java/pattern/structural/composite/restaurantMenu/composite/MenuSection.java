package pattern.structural.composite.restaurantMenu.composite;

import pattern.structural.composite.restaurantMenu.commonInterface.MenuComponent;

import java.util.ArrayList;
import java.util.List;

public class MenuSection implements MenuComponent {
    private String name;
    private List<MenuComponent> children = new ArrayList<>();

    public MenuSection(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.printf("Section - %s%n", name);
        for (MenuComponent child : children) {
            child.showDetails();
        }
    }
}
