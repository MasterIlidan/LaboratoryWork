package laba7;

public class superClass01 {
    private String string1;

    superClass01(String input) {
        string1 = input;
    }
    public String getString () {
        return string1;
    }
    @Override
    public String toString () {
        return "Class " + getClass().getName() + " contain " + string1;
    }
}
