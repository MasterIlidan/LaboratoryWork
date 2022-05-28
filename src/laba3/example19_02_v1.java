package laba3;

import java.util.Scanner;

public class example19_02_v1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String dayOfWeek = in.nextLine();
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("monday")) {
            System.out.print("It's 1 day of week");
            return;
        }
        if (dayOfWeek.equals("Tuesday") || dayOfWeek.equals("tuesday")) {
            System.out.print("It's 2 day of week");
            return;
        }
        if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("wednesday")) {
            System.out.print("It's 3 day of week");
            return;
        }
        if (dayOfWeek.equals("Thursday") || dayOfWeek.equals("thursday")) {
            System.out.print("It's 4 day of week");
            return;
        }
        if (dayOfWeek.equals("Friday") || dayOfWeek.equals("friday")) {
            System.out.print("It's 5 day of week");
            return;
        }
        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("saturday")) {
            System.out.print("It's 6 day of week");
            return;
        }
        if (dayOfWeek.equals("Sunday") || dayOfWeek.equals("sunday")) {
            System.out.print("It's 7 day of week");
            return;
        }
        else {
            System.out.print("Incorrect input");
        }
        in.close();
    }
}
