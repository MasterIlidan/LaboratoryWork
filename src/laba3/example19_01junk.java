package laba3;

import java.util.Scanner;

public class example19_01junk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int todaysDate = 0;
        String[] dayOfWeek = new String[7];

        dayOfWeek[0] = "Monday";
        dayOfWeek[1] = "Tuesday";
        dayOfWeek[2] = "Wednesday";
        dayOfWeek[3] = "Thursday";
        dayOfWeek[4] = "Friday";
        dayOfWeek[5] = "Saturday";
        dayOfWeek[6] = "Sunday";

        System.out.print("Enter today's date ");
        todaysDate = in.nextInt();
        switch (todaysDate) {
            case 0:
            {
                System.out.printf("It's %s", dayOfWeek);
            }
        }
    }
}
