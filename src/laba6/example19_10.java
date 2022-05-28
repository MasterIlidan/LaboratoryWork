package laba6;

import java.util.Arrays;
import java.util.Scanner;

public class example19_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int[] maxmin = maxmin(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        System.out.printf("Max number is %s min number is %s", maxmin[1], maxmin[0]);
        System.out.println();
    }
    //определяет из множества переданных аргументов максимальный и минимальный
    public static int[] maxmin (int...nums){
        int[] maxmin = new int[2];
        Arrays.sort(nums);
        //минимальное число
        maxmin[0] = nums[0];
        //максимальное число
        maxmin[1] = nums[nums.length-1];
        return maxmin;
    }
}
