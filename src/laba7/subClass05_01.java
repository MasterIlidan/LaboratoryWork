package laba7;

public class subClass05_01 extends superClass05 {
    private int num;

    subClass05_01 (String string, int num) {
        super(string);
        this.num = num;
    }
    @Override
    public String toString () {
        return getClass().getName() + " contain\n" +
                "string: " + super.getString() + "\n" +
                "num:" + num;
    }
}
