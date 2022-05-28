package laba7;

public class subClass02 extends superClass02 {
    public int openField;

    subClass02(int inputInt, String inputString) {
        super(inputString);
        openField = inputInt;
    }
    @Override
    public void setValue() {
        openField = 0;
        super.setValue();
    }

    public void setValue(int input) {
        openField = input;
    }

    @Override
    public void setValue(String input) {
        super.setValue(input);
    }

    public void setValue(String inputString, int inputInt) {
        super.setValue(inputString);
        openField = inputInt;
    }
    @Override
    public String getValue () {
        return super.getValue() + "\n" + getClass().getName() + " public value is " + openField;
    }


}
