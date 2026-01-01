package pattern.structural.composite.restaurantMenu;

import pattern.structural.composite.restaurantMenu.composite.MenuSection;
import pattern.structural.composite.restaurantMenu.leaf.MenuItem;

public class Runner {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("BBQ", 30.99);
        MenuItem item2 = new MenuItem("Ice cream", 9.50);
        MenuSection section1 = new MenuSection("First Dishes");
        section1.add(item1);
        MenuSection section2 = new MenuSection("Desserts");
        section2.add(item2);
        MenuSection mainSection = new MenuSection("Main");
        mainSection.add(section1);
        mainSection.add(section2);
        mainSection.showDetails();
    }
}
