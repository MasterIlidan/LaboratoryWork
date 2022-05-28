package laba2;

import java.util.Scanner;

public class example19_05 {
    public static void main(String[] args) {
        int thousands = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number which more than 1000: ");
        int number = in.nextInt();

        if ( number >= 1000){
            thousands = number/1000;
            System.out.printf("Your number %s have %s thousands", number, thousands);
        }
        else System.out.printf("Your number %s less than 1000", number);

        in.close();
    }
}
