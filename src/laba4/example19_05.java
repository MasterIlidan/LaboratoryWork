package laba4;

import java.util.Random;

public class example19_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] nums = new int[5][10]; //исходный массив
        int[][] reversedNums = new int [10][5];
        System.out.print("Original array is:\n");
        for (int s = 0; s < nums.length; s++) { //заполнение исходного массива
            for (int c = 0; c < nums[s].length; c++) {
                nums[s][c] = random.nextInt(1000);
                System.out.printf("%s\t", nums[s][c]);
            }
            System.out.println();
        }
        System.out.print("\nReversed array is:\n");
        for (int s = 0; s < reversedNums.length; s++) { //заполнение reversed массива
            for (int c = 0; c < reversedNums[s].length; c++) {
                reversedNums[s][c] = nums [c][s];
                System.out.printf("%s\t", reversedNums[s][c]);
            }
            System.out.println();
        }
    }
}
