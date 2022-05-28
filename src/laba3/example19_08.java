package laba3;

public class example19_08 {
    public static void main(String[] args) {
        final int literA = 65; // десятичный код символа 'A' в unicode

        char[] targetMassive = new char[10];

        for (int count = 0, i = 0; count < 10; i++) {
            char chars = (char) (literA+i);

            if(chars != 'A' && chars != 'E' && chars != 'I') {
                targetMassive[count] = chars;
                count++;
            }
        }

        System.out.println("List of first ten consonants: ");

        for(char x:targetMassive) {
            System.out.println(x);
        }
    }
}
