package laba7;

public class superClass02 {
    private String privateString;
    private int lengthOfString;

    superClass02 (String input) {
        privateString = input;
        lengthOfString = privateString.length();
    }
    public void setValue () {
        privateString = null;
        lengthOfString = 0;
    }
    public void setValue (String input) {
        privateString = input;
        lengthOfString = privateString.length();
    }
    public String getLengthOfString() {
        return getClass().getName() + " length of private field is " + lengthOfString;
    }
    public String getValue () {
        return getClass().getName() + " value is: " + privateString;
    }
}
