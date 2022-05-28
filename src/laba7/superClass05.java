package laba7;

public class superClass05 {
    private String string;

    superClass05 (String string) {
        this.string = string;
    }

    public String getString () {
        return string;
    }
    public String toString () {
        return getClass().getName() + " contain\n" +
                "string: " + string;
    }
}
