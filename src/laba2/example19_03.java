package laba2;

import java.util.Scanner;

public class example19_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number which dividable by 4 and it's more than 10: ");
        int number = in.nextInt();

        if (number % 4 == 0 && number > 10) System.out.printf("Your number %s meets the conditions", number);
        else System.out.printf("Your number %s isn't meets the conditions", number);

        in.close();
    }
}
