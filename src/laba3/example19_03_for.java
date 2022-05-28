package laba3;

import java.util.Scanner;

public class example19_03_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of numbers in the sequence: ");
        int numberOfNumbers = in.nextInt();
        int[] sequence = new int[numberOfNumbers];
        sequence[0] = 1;
        sequence[1] = 1;
        System.out.printf("%s %s ", sequence[0], sequence[1]);
        for (int i=2; i<sequence.length; i++)
        {
            sequence[i] = sequence[i-1] + sequence[i-2];
            System.out.printf("%s ", sequence[i]);
        }
    }
}
