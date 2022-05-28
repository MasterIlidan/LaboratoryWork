package laba1;

import java.util.Scanner;

public class example19_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = 2021;
        int userAge;
        System.out.print("Enter your name: ");
        String userName = in.nextLine();
        System.out.print("Enter your year of birth: ");
        int birthYear = in.nextInt();
        userAge = currentYear - birthYear;
        System.out.printf("Your name is: %s %nYour age is: %s \n", userName, userAge);
        in.close();
    }
}
