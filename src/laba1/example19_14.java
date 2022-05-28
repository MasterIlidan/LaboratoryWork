package laba1;

import java.util.Scanner;

public class example19_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = 2021;
        System.out.print("Enter your age: ");
        int userAge = in.nextInt();
        int yearOfBirth = currentYear - userAge;
        System.out.printf("Your year of birth is: %s", yearOfBirth);
        in.close();
    }
}
