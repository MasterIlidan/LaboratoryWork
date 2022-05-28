package laba7;

public class example20_04 {
    public static void main(String[] args) {
        superClass04 superClass = new superClass04('j');
        System.out.println(superClass);
        superClass04 superClassCopy = new superClass04(superClass);
        System.out.println(superClassCopy);
        System.out.println();

        subClass04 subClass = new subClass04('l', "Hello");
        System.out.println(subClass);
        subClass04 subClassCopy = new subClass04(subClass);
        System.out.println(subClassCopy);
        System.out.println();

        subSubClass02 subSubClass = new subSubClass02('u', "Good bye", 999);
        System.out.println(subSubClass);
        subSubClass02 subSubClassCopy = new subSubClass02(subSubClass);
        System.out.println(subSubClassCopy);
    }
}
