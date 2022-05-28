package laba7;

public class subClass03 extends superClass03 {
    public char symbol;

    subClass03 (int num, char symbol) {
        super(num);
        this.symbol = symbol;
    }
    public void setValue(int num, char symbol) {
        super.setValue(num);
        this.symbol = symbol;
    }

    @Override
    public String toString () {
        return getClass().getName() + " contain\n" +
                "num: " + super.num + "\n" +
                "symbol " + symbol;
    }
}
