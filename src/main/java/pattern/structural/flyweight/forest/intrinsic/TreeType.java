package pattern.structural.flyweight.forest.intrinsic;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.printf("Drawing the %s (color - %s, texture - %s) at position(x: %d, y: %d)%n.",
                name, color, texture, x, y);
    }
}
