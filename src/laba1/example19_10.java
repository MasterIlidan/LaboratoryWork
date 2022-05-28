package laba1;

import java.util.Scanner;

public class example19_10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String day_of_week = in.nextLine();
        System.out.print("What month is it?: ");
        String name_of_month = in.nextLine();
        System.out.print("Enter today's date: ");
        int today_date = in.nextInt();
        System.out.printf("Day of week: %s Month: %s Day: %s \n", day_of_week, name_of_month, today_date);
        in.close();
    }
}