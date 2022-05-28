package laba3;

import java.util.Random;
import java.util.Scanner;

public class example19_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of massive: ");
        int numberOfNums = in.nextInt();
        int[] nums = new int[numberOfNums];
        int[] reverseNums = new int[numberOfNums];
        int reverse = nums.length - 1;
        Random random = new Random();
        for (int i=0; i<nums.length; i++)
        {
            nums[i] = random.nextInt(200);
            reverseNums[reverse] = nums[i];
            reverse--;
            System.out.printf("%s%n", nums[i]);
        }
        System.out.printf("%n");
        for (int i = 0; i<numberOfNums; i++)
        {
            System.out.printf("%s%n", reverseNums[i]);
        }

    }
}
