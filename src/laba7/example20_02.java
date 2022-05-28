package laba7;

public class example20_02 {
    public static void main(String[] args) {
        //действия с суперклассом
        superClass02 superClass = new superClass02("This is a private text field");
        //вывод результата после объявления объекта суперкласса
        System.out.println(superClass.getLengthOfString());
        System.out.println(superClass.getValue());
        //изменение значения объекта суперкласса без параметров
        superClass.setValue();
        System.out.println("\n");
        System.out.println(superClass.getLengthOfString());
        System.out.println(superClass.getValue());
        //изменение значения объекта суперкласса с параметром
        superClass.setValue("This is edited private text field");
        System.out.println("\n");
        System.out.println(superClass.getLengthOfString());
        System.out.println(superClass.getValue());

        //действия с подклассом
        subClass02 subClass = new subClass02(10 , "This is a private text field");
        //вывод результата после объявления объекта подкласса
        System.out.println("\n");
        System.out.println(subClass.getLengthOfString());
        System.out.println(subClass.getValue());
        //изменение значения подкласса без параметров
        subClass.setValue();
        System.out.println("\n");
        System.out.println(subClass.getLengthOfString());
        System.out.println(subClass.getValue());
        //изменение значения подкласса с текстовым параметром
        subClass.setValue("This is edited private text field");
        System.out.println("\n");
        System.out.println(subClass.getLengthOfString());
        System.out.println(subClass.getValue());
        //изменение значения подкласса с целочисленым параметром
        subClass.setValue(5673);
        System.out.println("\n");
        System.out.println(subClass.getLengthOfString());
        System.out.println(subClass.getValue());
        //изменение значения подкласса с текстовым и целочисленным парамтром
        subClass.setValue("This private text field was edited again", 98765);
        System.out.println("\n");
        System.out.println(subClass.getLengthOfString());
        System.out.println(subClass.getValue());
    }
}
