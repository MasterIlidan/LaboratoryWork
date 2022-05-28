package laba2;

import java.util.Scanner;

public class example19_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 5 and 10 inclusive: ");
        int number = in.nextInt();

        if ( number <= 10 && number >=5) System.out.printf("Your number %s meets the conditions", number);
        else System.out.printf("Your number %s isn't meets the conditions", number);

        in.close();
    }
}
