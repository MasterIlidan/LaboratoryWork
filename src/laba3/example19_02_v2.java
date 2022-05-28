package laba3;

import java.util.Scanner;

public class example19_02_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        String dayOfWeek = in.nextLine();

        switch (dayOfWeek)
        {
            case ("Monday"):
            case ("monday"): {
                System.out.print("It's 1 day of week");
                break;
            }
            case "Tuesday":
            case "tuesday": {
                System.out.print("It's 2 day of week");
                break;
            }
            case "wednesday":
            case "Wednesday": {
                System.out.print("It's 3 day of week");
                break;
            }
            case "thursday":
            case "Thursday": {
                System.out.print("It's 4 day of week");
                break;
            }
            case "friday":
            case "Friday": {
                System.out.print("It's 5 day of week");
                break;
            }
            case "saturday":
            case "Saturday": {
                System.out.print("It's 6 day of week");
                break;
            }
            case "sunday":
            case "Sunday": {
                System.out.print("It's 7 day of week");
                break;
            }
            default: {
                System.out.print("Incorrect input");
            }
        }
    }
}
