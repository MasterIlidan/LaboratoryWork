package laba6;

public class example19_02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) num.showNum();
    }
}

class num {
    private static int num = 0;

    public static void showNum() {
        System.out.printf("Value of static int is: %s\n", num);
        num++;
    }
}
