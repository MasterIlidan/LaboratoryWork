package laba7;

public class subClass05_02 extends superClass05 {
    private char symbol;

    subClass05_02 (String string, char symbol) {
        super(string);
        this.symbol = symbol;
    }
    @Override
    public String toString () {
        return getClass().getName() + " contain\n" +
                "string: " + super.getString() + "\n" +
                "symbol: " + symbol;
    }
}
