package laba3;

import java.util.Random;
import java.util.Scanner;

public class example19_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int numberOfNums = in.nextInt();
        int[] nums = new int[numberOfNums];
        Random random = new Random();
        int currElemOfMassive = 0;
        for (int i = 0; i<=10000; i++)
        {
            if (i % 5 == 2)
            {
                nums[currElemOfMassive] = i;
                currElemOfMassive++;
            }
            if (currElemOfMassive == numberOfNums)
                break;
        }
        System.out.printf("%n");
        for (int i = 0; i < numberOfNums; i++) {
            System.out.printf("%s%n", nums[i]);
        }
        in.close();
    }
}
