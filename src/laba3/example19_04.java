package laba3;

import java.util.Arrays;
import java.util.Scanner;

public class example19_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter two numbers:%n");
        int[] inputNums = new int[2];
        inputNums[0] = in.nextInt();
        inputNums[1] = in.nextInt();
        Arrays.sort(inputNums); //0 - меньшее число, 1 - большее число
        int sizeOfResult = inputNums[1] - inputNums[0];
        int[] result = new int[sizeOfResult+1];
        result[0] = inputNums[0];
        System.out.printf("%s ", result[0]);
        for (int i = 1; i<=sizeOfResult; i++)
        {
            result[i] = result[i-1] + 1;
            System.out.printf("%s ", result[i]);
        }
        in.close();
    }
}
