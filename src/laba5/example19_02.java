package laba5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example19_02 {
    public static void main(String[] args) {
        out();

    }

    public static void out() {
        Scanner in = new Scanner(System.in);

        char symbol1 = 0;
        do {
            System.out.print("Введите код первого символа ");
            try {
                symbol1 = (char) in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Необходимо ввести число");
            }
            in.nextLine();
        } while (symbol1 == 0);

        char symbol2 = 0;
        do {
            System.out.print("Введите код второго символа ");
            try {
                symbol2 = (char) in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Необходимо ввести число");
            }
            in.nextLine();
        } while (symbol2 == 0);

        int[] temp = {symbol1, symbol2};
        symbol2 = (char) Math.max(temp[0], temp[1]);
        symbol1 = (char) Math.min(temp[0], temp[1]);
        
        for (int i = symbol1; i <= symbol2; i++) {
            char tempChar = (char) i;
            String output = (tempChar + " ");
            System.out.print(output);
        }
    }
}