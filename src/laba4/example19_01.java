package laba4;

public class example19_01 {
    public static void main(String[] args) {
        int wight = 23; //ширина (кол-во симловов в строке)
        int stringsCount = 11; //высота (количетсво строк)
        for (int i1 = 1; i1<=stringsCount; i1++){
            for (int i2 = 1; i2<=wight; i2++){
                System.out.print("+");
            }
            System.out.print("\n");
        }
    }
}
