package laba2;

import java.util.Scanner;

public class example19_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number % 3 == 0) System.out.printf("Your number %s is divisible by 3", number);
        else System.out.printf("Your number %s isn't divisible by 3", number);

        in.close();
    }
}
