package laba5;

import java.util.Scanner;

public class example19_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        numbersExample5 numbers1 = new numbersExample5();
        System.out.print("Enter a number ");
        numbersExample5 numbers2 = new numbersExample5(in.nextInt());
        System.out.print("Enter another number ");
        numbers1.SetNum(in.nextInt());
        numbers2.SetNum();
        numbers1.ShowNum();
        numbers2.ShowNum();
    }
}

class numbersExample5 {
    private int num;

    numbersExample5() {
        num = 0;
    }

    numbersExample5(int setnum) {
        if (setnum > 100) num = 100;
        else num = setnum;
    }

    public void SetNum() {
        num = 0;
    }

    public void SetNum(int setnum) {
        if (setnum > 100) num = 100;
        else num = setnum;
    }

    public void ShowNum() {
        System.out.printf("Private int equal %s\n", num);
    }
}
