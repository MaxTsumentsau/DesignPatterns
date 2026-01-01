package pattern.structural.composite.restaurantMenu.leaf;

import pattern.structural.composite.restaurantMenu.commonInterface.MenuComponent;

public class MenuItem implements MenuComponent {
    private String name;
    private Double price;

    public MenuItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.printf("Dish - %s, price - %.2f$%n", name, price);
    }
}
