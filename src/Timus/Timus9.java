package Timus;

import java.util.Scanner;
//задача 1083 (приняло)
public class Timus9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int countOfSigns; //количество восклицательных знаков
        int answer = num;
        String s = input[1];
        countOfSigns = s.length();
        if (num % countOfSigns != 0) {
            int x = 1;
            while (true) {
                if (num - countOfSigns * x <= 0) break;
                answer *= (num - countOfSigns * x);
                x++;
            }
        }
        else {
            int x = 1;
            while (true) {
                if (num - countOfSigns * x <= 0) break;
                answer *= (num - countOfSigns * x);
                x++;
            }
        }
        System.out.print(answer);
    }
}
