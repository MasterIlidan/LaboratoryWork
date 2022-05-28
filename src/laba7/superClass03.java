package laba7;

public class superClass03 {
    public int num;

    superClass03 (int num) {
        this.num = num;
    }

    public void setValue(int num) {
        this.num = num;
    }

    @Override
    public String toString () {
        return getClass().getName() + " contain\n" +
                "num: " + num;
    }
}
