package pattern.structural.flyweight.characterCache;

public class CharacterFlyweight {
    private final char symbol; //intrinsic state

    public CharacterFlyweight(char symbol) {
        this.symbol = symbol;
    }

    public void print(int position) { //extrinsic state
        System.out.printf("Symbol %c at position %d.%n", symbol, position);
    }
}
