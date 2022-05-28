package laba6;

import java.util.Scanner;

public class example19_04_Recursion {
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
        factorialRecursion.setFactorial(num);
    }
}

class factorialRecursion {
    public static long setFactorial(long num) {
        long factorial = num;
        if (num == 2) return 2;
        if (num == 1) return 1;
        factorial *= setFactorial(num - 2);
        System.out.println(factorial);
        return factorial;
    }
}
