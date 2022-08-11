import java.util.Random;

public class Reel {
    private Symbols symbol;

    public Symbols getSymbol() {
        return symbol;
    }

    public int getValue() {
        return symbol.getValue();
    }

    public void setRandomSymbol() {
        int spin = new Random().nextInt(3);
        symbol = Symbols.values()[spin];
    }


}
