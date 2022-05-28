package Timus;

import java.util.Scanner;
//задача 1068 (приняло)
public class Timus6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = Integer.parseInt(in.nextLine());
        if (result > 0)
            System.out.println((result * (result + 1)) / 2);

        else {
            result = Math.abs(result);
            System.out.println(1 - (result * (result + 1) / 2));
        }

    }
}
/*
    public static int sum(String input) {
        boolean isNumNegative = input.startsWith("-");
        int sum = 1;
        int n = Integer.parseInt(input);

        if (to == 1) return 1;
        if (!isNumNegative) {
            for (int i = 1; i <= to; i++) {
                sum += i;
            }
        }
        else {
            for (int i = -1; i >= to; i--) {
                sum += i;
            }
        }


        return sum;
    }
    */

