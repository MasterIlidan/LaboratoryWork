package laba7;

public class example20_05 {
    public static void main(String[] args) {
        superClass05 superClass = new superClass05("Hello!");
        System.out.println(superClass);

        subClass05_01 subClass05_01 = new subClass05_01("Hello?", 99);
        System.out.println();
        System.out.println(subClass05_01);

        subClass05_02 subClass05_02 = new subClass05_02("Good bye", 'h');
        System.out.println();
        System.out.println(subClass05_02);
    }
}
