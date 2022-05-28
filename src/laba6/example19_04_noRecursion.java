package laba6;

import java.util.Scanner;

public class example19_04_noRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        while (true) {
            if (in.hasNextInt()) {
                num = in.nextInt();
                in.nextLine();
                break;
            } else {
                in.nextLine();
            }
        }

        factorialNoRecursion.setFactorial(num);
    }
}

class factorialNoRecursion {
    public static void setFactorial(int num) {
        long factorial = num;
        while ((num -= 2) > 1) {
            factorial *= num;
            System.out.println(factorial);
        }
    }
}
