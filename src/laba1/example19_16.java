package laba1;

import java.util.Scanner;

public class example19_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float inputNumber = in.nextFloat();
        float firstNumber = inputNumber - 1; //первое число
        float thirdNumber = inputNumber + 1; //третье число
        float fourthNumber = inputNumber * inputNumber;
        System.out.printf("%s %s %s %s", firstNumber, inputNumber, thirdNumber, fourthNumber);
        in.close();
    }
}
