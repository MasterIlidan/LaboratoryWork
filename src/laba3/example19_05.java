package laba3;

import java.util.Random;
import java.util.Scanner;

public class example19_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int numberOfNums = in.nextInt();
        int[] nums = new int[numberOfNums];
        Random random = new Random();
        int sum = 0;
        while (sum % 5 != 2 || sum % 3 != 1) {
            sum = 0;
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(200);
            }
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%s%n", nums[i]);
        }
        in.close();
    }
}
