package laba1;

import java.util.Scanner;

public class example19_08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your second name: ");
        String second_name = in.nextLine();
        System.out.print("Enter your first name: ");
        String first_name = in.nextLine();
        System.out.print("Enter your patronymic: ");
        String patronymic = in.nextLine();
        System.out.printf("Hello, %s %s %s", second_name, first_name, patronymic);
        in.close();
    }
}
