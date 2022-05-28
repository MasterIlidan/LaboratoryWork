package Timus;

import java.util.Scanner;
//задача 1638 (приняло)
public class Timus8 {
    public static void main(String[] args) {
        int n, k, t1, t2;
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        n = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);
        t1 = Integer.parseInt(input[2]);
        t2 = Integer.parseInt(input[3]);
        if (t2>t1) System.out.println((t2-t1-1)*(2*k+n)+2*k);
        else System.out.println((t1-t2)*(k+k+n)+n);
    }
}
