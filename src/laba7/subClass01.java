package laba7;

public class subClass01 extends superClass01 {
    private String string;

    subClass01(String input) {
        super(input);
    }

    subClass01(String input1, String input2) {
        super(input1);
        string = input2;
    }

    @Override
    public String toString () {
        return "SubClass " + getClass().getName() + " contain\n" + getString() + "\n" + string;
    }
}
