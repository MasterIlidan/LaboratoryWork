package laba7;

public class example20_01 {
    public static void main(String[] args) {
        superClass01 superClass = new superClass01("WTF");
        System.out.println(superClass);
        subClass01 subClass1 = new subClass01("Submissive");
        System.out.println(subClass1);
        subClass01 subClass2 = new subClass01("Submissive" , "Breedable");
        System.out.println(subClass2);
    }
}
