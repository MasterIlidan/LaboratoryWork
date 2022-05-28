package laba1;

import java.util.Scanner;

public class example19_11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of month: ");
        String month = in.nextLine();
        System.out.print("How many days in your month?: ");
        int daysInMonth = in.nextInt();
        System.out.printf("In %s %s days\n", month, daysInMonth);
        in.close();
    }
}