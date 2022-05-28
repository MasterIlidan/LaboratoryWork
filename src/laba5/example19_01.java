package laba5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example19_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        closedChar charf = new closedChar();
        char input = 0;

        do {
            try {
                System.out.print("Enter symbol code: ");
                input = (char) in.nextInt();
            } catch (InputMismatchException e){
                System.out.println("You need enter a number!");
            }
            in.nextLine();
        } while (input == 0);

        charf.SetChar(input);
        System.out.printf("Symbol code: %s\n", charf.ShowCharCode());
        System.out.printf("Symbol code: %s, number %s", charf.ShowCharCode(), charf.ShowCharSymbolWithCode());
    }
}

class closedChar {
    private char symbol;

    public void SetChar(char in) {
        symbol = in;
        System.out.println("Value assigned");
    }

    public int ShowCharCode() {
        return symbol;
    }

    public String ShowCharSymbolWithCode() {
        return (symbol+" ");
    }


}
