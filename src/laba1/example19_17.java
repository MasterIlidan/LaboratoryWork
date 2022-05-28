package laba1;

import java.util.Scanner;

public class example19_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float firstNumber = in.nextFloat();
        System.out.print("Enter second number: ");
        float secondNumber = in.nextFloat();
        float subtr = firstNumber - secondNumber;
        float sum = firstNumber + secondNumber;
        System.out.printf("Sum of these numbers: %s\nSubtraction of these numbers: %s\n", sum, subtr);
        in.close();
    }
}
