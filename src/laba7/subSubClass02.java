package laba7;

public class subSubClass02 extends subClass04 {
    public int num;

    subSubClass02 (char symbol, String string, int num) {
        super(symbol, string);
        this.num = num;
    }

    subSubClass02 (subSubClass02 o) {
        super(o.symbol, o.string);
        this.num = o.num;
        System.out.println("Copy created");
    }
}
