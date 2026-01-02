package pattern.structural.flyweight.characterCache;

import pattern.structural.flyweight.characterCache.factory.CharacterFactory;

public class Runner {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        String text = "HELLO!";
        for (int i = 0; i < text.length(); i++) {
            CharacterFlyweight flyweight = factory.getCharacter(text.charAt(i));
            flyweight.print(i);
        }
    }
}
