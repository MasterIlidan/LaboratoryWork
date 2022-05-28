package laba7;

public class subClass04 extends superClass04{
    public String string;

    subClass04 (char symbol, String string) {
        super(symbol);
        this.string = string;
    }

    subClass04 (subClass04 o) {
        super(o.symbol);
        this.string = o.string;
    }

    @Override
    public String toString () {
        return getClass().getName() + " contain\n" +
                "symbol: " + symbol + "\n" +
                "string: " + string;
    }
}
