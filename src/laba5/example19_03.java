package laba5;

import java.util.Scanner;

public class example19_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number ");
        int num1 = in.nextInt();
        System.out.print("Enter second number ");
        int num2 = in.nextInt();
        numbers abc;
        if ((num1 == 0 | num1 < 0) & (num2 == 0 | num2 < 0)) {
            numbers j = new numbers();
            abc = j;
        } else if (num1 == 0 | num1 < 0) {
            numbers j = new numbers(num2);
            abc = j;
        } else {
            numbers j = new numbers(num1, num2);
            abc = j;
        }
        System.out.print(abc.Sum(abc));
    }
}

class numbers {
    private int a;
    private int b;

    numbers() {
        a = 0;
        b = 0;
    }

    numbers(int a) {
        this.a = a;
        b = 0;
    }

    numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String Sum(numbers o) {
        return "Sum of numbers " + o.a + " and " + o.b + " equal " + (o.a + o.b);
    }
}
