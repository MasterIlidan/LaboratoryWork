package laba3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example19_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of massive: ");
        int numberOfNums = in.nextInt();
        int[] nums1 = new int[numberOfNums];
        int[] nums2 = new int[numberOfNums];
        Random random = new Random();
        for (int i = 0; i<nums1.length; i++){
            nums1[i] = random.nextInt(200);
            nums2[i] = nums1[i];
        }
        Arrays.sort(nums1);
        for (int i = 0; i<nums1.length; i++) {
            if (nums1[0] == nums2[i])
            {
            System.out.printf("Number %s index %s", nums2[i], i);
            }
        }

    }
}
