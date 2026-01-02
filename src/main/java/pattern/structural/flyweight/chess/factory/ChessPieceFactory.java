package pattern.structural.flyweight.chess.factory;

import pattern.structural.flyweight.chess.intrinsic.ChessPiece;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceFactory {
    private static Map<PeaceKey, ChessPiece> pool = new HashMap<>();

    public static ChessPiece getPiece(String type, String color) {
        PeaceKey key = new PeaceKey(type, color);
        pool.putIfAbsent(key, new ChessPiece(type, color));
        return pool.get(key);
    }
}
