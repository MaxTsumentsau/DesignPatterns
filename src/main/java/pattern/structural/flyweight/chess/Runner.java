package pattern.structural.flyweight.chess;

import pattern.structural.flyweight.chess.extrinsic.PositionedPiece;
import pattern.structural.flyweight.chess.factory.ChessPieceFactory;

public class Runner {
    public static void main(String[] args) {
        PositionedPiece queen1 = new PositionedPiece(
                ChessPieceFactory.getPiece("Queen", "white"), 1, 5
        );
        PositionedPiece queen2 = new PositionedPiece(
                ChessPieceFactory.getPiece("Queen", "white"), 25, 5
        );
        PositionedPiece king1 = new PositionedPiece(
                ChessPieceFactory.getPiece("King", "white"), 1, 6
        );

        queen1.draw();
        queen2.draw();
        king1.draw();
    }
}
