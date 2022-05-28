package laba4;

public class example19_02 {
    public static void main(String[] args) {
        int wight = 6; //ширина (кол-во симловов в строке)
        int stringsCount = 6; //высота (количетсво строк)
        for (int i1 = 1; i1 <= stringsCount; i1++) {
            for (int i2 = 1; i2 <= i1; i2++) {
                System.out.print("+");
            }
            System.out.print("\n");
        }
    }
}
