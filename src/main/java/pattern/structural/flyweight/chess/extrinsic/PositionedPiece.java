package pattern.structural.flyweight.chess.extrinsic;

import pattern.structural.flyweight.chess.intrinsic.ChessPiece;

public class PositionedPiece {
    private int x;
    private int y;
    private final ChessPiece chessPiece;

    public PositionedPiece(ChessPiece chessPiece, int x, int y) {
        this.chessPiece = chessPiece;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        chessPiece.draw(x, y);
    }
}
