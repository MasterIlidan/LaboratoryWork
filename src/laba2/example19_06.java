package laba2;

import java.util.Scanner;

public class example19_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number with remainder of 7 is 1 and remainder of 5 is 2: ");
        int number = in.nextInt();

        if (number % 5 == 2 && number % 7 == 1) System.out.printf("Your number %s meets the conditions", number);
        else System.out.printf("Your number %s isn't meets the conditions", number);

        in.close();
    }

}