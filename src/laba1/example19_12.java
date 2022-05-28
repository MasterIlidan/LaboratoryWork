package laba1;
import java.util.Scanner;
public class example19_12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int currentYear = 2021;
        int userAge;
        System.out.print("Enter your year of birth: ");
        int birthYear = in.nextInt();
        userAge = currentYear - birthYear;
        System.out.printf("Your age is: %s \n", userAge);
        in.close();
            }
}
