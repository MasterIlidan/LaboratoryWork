package laba6;

import java.util.Arrays;
import java.util.Random;

public class example19_08 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums;
        //создание случайного массива случайной длины
        System.out.println("Generating array with random length and random values...");
        //чтобы не допустить генерацию массива нулевой длины
        do{
            nums = new int[random.nextInt(15)];
        } while (nums.length == 0);
        System.out.printf("Number of elements in array is %s\n", nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(5000);
        }
        System.out.printf("Elements of array %s", Arrays.toString(nums));
        System.out.println();

        System.out.printf("Average of array is %s", averageNum(nums));
    }
    public static int averageNum (int[] nums){
        int sum = 0;
        for (int x:nums){
            sum += x;
        }
        return sum / nums.length;
    }
}
