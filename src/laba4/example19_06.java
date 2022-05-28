package laba4;

import java.util.Random;

public class example19_06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] nums = new int[10][5]; //исходный массив
        int[][] processedNums = new int [10][5];
        int[] whatToDelete = {random.nextInt(nums.length), random.nextInt(nums[0].length)};
        System.out.print("Original array is:\n");
        for (int s = 0; s < nums.length; s++) { //заполнение исходного массива
            for (int c = 0; c < nums[s].length; c++) {
                nums[s][c] = random.nextInt(1000);
                System.out.printf("%s\t", nums[s][c]);
            }
            System.out.println();
        }
        System.out.print("\nProcessed array is:\n");
        for (int s = 0; s < processedNums.length; s++) { //заполнение исходного массива
            for (int c = 0; c < processedNums[s].length; c++) {
                if (s == whatToDelete[0] || c == whatToDelete[1]) {
                    processedNums [s][c] = 0;
                }
                else {
                    processedNums [s][c] = nums [s][c];
                }
                System.out.printf("%s\t", processedNums[s][c]);
            }
            System.out.println();
        }
        System.out.printf("%nDeleted %s line and %s column of array", whatToDelete[0]+1, whatToDelete[1]+1);
    }
}
