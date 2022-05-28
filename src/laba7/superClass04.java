package laba7;

public class superClass04 {
    public char symbol;

    superClass04 (char symbol) {
        this.symbol = symbol;
    }

    superClass04 (superClass04 o) {
        this.symbol = o.symbol;
    }
    @Override
    public String toString () {
        return getClass().getName() + " contain\n" +
                "symbol: " + symbol;
    }
}
