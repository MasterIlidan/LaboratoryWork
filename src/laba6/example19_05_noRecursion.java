package laba6;

import java.util.Scanner;

public class example19_05_noRecursion {
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
        exponentiateNoRecursion.exponentiate(num);
    }
}

class exponentiateNoRecursion {
    public static int exponentiate (int num){
        int exp = 0;
        for (int i = 1; i <= num; i++){
            exp += (int) Math.pow(i, 2);
            System.out.println(exp);
        }
        return exp;
    }
}
