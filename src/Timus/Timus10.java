package Timus;

import java.util.Arrays;
import java.util.Scanner;
//задача 1025 (приняло)
public class Timus10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfGroups = in.nextInt();
        int[] voters = new int[countOfGroups];
        int result = 0;
        for (int i = 0; i < countOfGroups; i++)
            voters[i] = in.nextInt();
        Arrays.sort(voters);
        for (int i = 0; i < (countOfGroups / 2) + 1; i++) {
            result += (voters[i] / 2) + 1;
        }
        System.out.println(result);
    }
}
