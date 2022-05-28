package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class example19_01 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        twoFields object = new twoFields();
        if (isThisAText("Enter something ")) {
            object.setValue(in.nextLine());
        } else {
            object.setValue((char) in.nextInt());
            in.nextLine();
        }
        object.showAll();

        if (isThisAText("Enter another something ")){
            object.setValue(in.nextLine().toCharArray());
        } else {
            object.setValue((char) in.nextInt());
            in.nextLine();
        }
        object.showAll();
    }
    //вводится текст или число
    private static boolean isThisAText(String message) {
        System.out.println(message);
        if (in.hasNextInt()) {
            System.out.println("It's a number");
            return false;
        } else {
            System.out.println("It's a text");
            return true;
        }
    }
}

class twoFields {
    private char symbol;
    private String text;
    //если на входе получаем код символа
    public void setValue(char symbol) {
        this.symbol = symbol;
        System.out.println("Value assigned to symbol");
    }
    //если на входе получаем строку
    public void setValue(String text) {
        this.text = text;
        System.out.println("Text assigned to text field");
    }
    //если на входе получаем символьный масив
    public void setValue(char[] symbols) {
        if (symbols.length == 0) return;
        if (symbols.length < 2) {
            this.symbol = symbols[0];
            System.out.println("Value assigned to symbol");
        } else {
            this.text = Arrays.toString(symbols);
            System.out.println("Text assigned to text field");
        }
    }
    //показать содержимое
    public void showAll() {
        System.out.print("Values is: text " + text);
        System.out.printf(" symbol %s\n", symbol);
    }
}
