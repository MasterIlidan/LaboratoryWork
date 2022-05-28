package laba6;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;
        int privet;
        System.out.println("Enter a number");
        if (in.hasNextInt()){
            privet = in.nextInt();
            System.out.printf("It's a number %s", privet);
        }
        else {
            text = in.nextLine();
            System.out.printf("It's a text %s", text);
        }
    }
}
