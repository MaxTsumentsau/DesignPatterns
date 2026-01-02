package pattern.structural.flyweight.characterCache.factory;

import pattern.structural.flyweight.characterCache.CharacterFlyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<Character, CharacterFlyweight> pool = new HashMap<>();

    public CharacterFlyweight getCharacter(char symbol) {
        pool.putIfAbsent(symbol, new CharacterFlyweight(symbol));
        return pool.get(symbol);
    }
}
