package laba7;

public class subSubClass01 extends subClass03 {
    public String string;

    subSubClass01(int num, char symbol, String string) {
        super(num, symbol);
        this.string = string;
    }

    public void setValue(int num, char symbol, String string) {
        super.setValue(num, symbol);
        this.string = string;
    }

    @Override
    public String toString () {
        return getClass().getName() + " contain\n" +
                "num: " + super.num + "\n" +
                "symbol: " + super.symbol + "\n" +
                "string: " + string;
    }
}
