package pattern.structural.flyweight.chess.intrinsic;

public class ChessPiece {
    private final String type;
    private final String color;

    public ChessPiece(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.printf("The chess piece %s with color %s positioned at x=%d, y=%d.%n", type, color, x, y);
    }
}
