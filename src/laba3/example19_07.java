package laba3;

import java.util.Scanner;

public class example19_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int numberOfNums = in.nextInt();
        char[] chars = new char[numberOfNums];
        char[] reverseChars = new char[numberOfNums];
        int reverse = numberOfNums-1;
        int numberOfSymbol = 97;
        for (int i = 0; i<chars.length; i++) {
            chars[i] = (char) numberOfSymbol;
            reverseChars[reverse] = chars[i];
            reverse--;
            numberOfSymbol += 2;
            System.out.printf("%s%n", chars[i]);
        }
        for (int i = 0; i<chars.length; i++)
        {
            System.out.printf("%s%n", reverseChars[i]);
        }
    }
}
