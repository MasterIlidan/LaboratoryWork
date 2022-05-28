package laba3;

import java.util.Scanner;

public class example19_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's date: ");
        int todayDate = in.nextInt();

        switch (todayDate) {
            case 1: {
                System.out.print("It's Monday");
            }
            case 2: {
                System.out.print("It's Tuesday");
            }
            case 3: {
                System.out.print("It's Wednesday");
            }
            case 4: {
                System.out.print("It's Thursday");
            }
            case 5: {
                System.out.print("It's Friday");
            }
            case 6: {
                System.out.print("It's Saturday");
            }
            case 7: {
                System.out.print("It's Sunday");
            }
            default: {
                System.out.print("Incorrect number");
            }
        }
        in.close();
    }
}
