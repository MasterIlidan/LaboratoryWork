package laba6;

import java.util.Scanner;

public class temp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stop = "yea";
        int privet;
        System.out.println("Enter something");

        while (stop != null){
            if (in.hasNextInt()){
                privet = in.nextInt();
                stop = in.next();
                System.out.printf("It's a number %s\n", privet);
            }
        }


    }
}
