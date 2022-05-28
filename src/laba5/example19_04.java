package laba5;

import java.util.Scanner;

public class example19_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        char inputLetter;
        double inputFloatnum;

        System.out.print("Enter symbol code ");
        inputLetter = (char) in.nextInt();
        System.out.print("Enter a number ");
        inputNum = in.nextInt();
        numbersv4 numbers1 = new numbersv4(inputLetter, inputNum);
        System.out.print("Enter float number ");
        inputFloatnum = in.nextFloat();
        numbersv4 numbers2 = new numbersv4(inputFloatnum);
        numbers1.Out(numbers1);
        numbers2.Out(numbers2);
    }
}

class numbersv4 {
    private char letter;
    private int num;

    numbersv4(char letter, int num) {
        this.letter = letter;
        this.num = num;
    }
    numbersv4(double floatnum) {
        letter = (char) floatnum;
        int tempnum = (int) floatnum;
        num = (int) ((floatnum - tempnum) * 100);


    }
    public void Out (numbersv4 o) {
        System.out.printf("Symbol %s number %s\n", letter, num);
    }
}
