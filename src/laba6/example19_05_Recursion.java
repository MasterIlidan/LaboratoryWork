package laba6;

import java.util.Scanner;

public class example19_05_Recursion {
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
        exponentiateRecursion.exponentiate(num);
    }
}

class exponentiateRecursion {
    public static int exponentiate(int num) {
        int exp;
        if (num == 1) return 1;
        exp = exponentiate(num-1) + (int) Math.pow(num, 2);
        System.out.println(exp);
        return exp;
    }
}
