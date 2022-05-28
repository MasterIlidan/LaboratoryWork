package laba1;

import java.util.Scanner;

public class example19_09 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String user_name = in.nextLine();
        System.out.print("Input age: ");
        int user_age = in.nextInt();
        System.out.printf("\nName: %s \nAge: %d", user_name, user_age);
        in.close();
    }
}