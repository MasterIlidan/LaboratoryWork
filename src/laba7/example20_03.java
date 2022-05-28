package laba7;

public class example20_03 {
    public static void main(String[] args) {
        //действия с суперклассом
        superClass03 superClass = new superClass03(10);
        System.out.println(superClass);
        superClass.setValue(22);
        System.out.println(superClass);

        //действия с подклассом
        subClass03 subClass = new subClass03(50, 'y');
        System.out.println("\n");
        System.out.println(subClass);
        subClass.setValue(65, 'd');
        System.out.println(subClass);

        //действия с подклассом подкласса
        subSubClass01 subSubClass = new subSubClass01(90, ';', "Hello");
        System.out.println("\n");
        System.out.println(subSubClass);
        subSubClass.setValue(333, 'k', "Good bye");
        System.out.println(subSubClass);
    }
}
