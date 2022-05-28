package laba5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example19_06 {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;

        // стандартный объект
        minMax object1 = new minMax();
        object1.ShowNums();

        // создание объекта с двумя переменными
        System.out.print("Enter first number ");
        firstNum = inputStream();
        System.out.print("Enter second number ");
        secondNum = inputStream();
        minMax object2 = new minMax(firstNum, secondNum);
        object2.ShowNums();

        //изменение чисел сущесвтующего объекта
        System.out.print("Enter first number ");
        firstNum = inputStream();
        System.out.print("Enter second number ");
        secondNum = inputStream();
        object1.SetNums(firstNum, secondNum);
        object1.ShowNums();

        //изменение только одного числа
        System.out.print("Enter a number ");
        firstNum = inputStream();
        object2.SetNums(firstNum);
        object2.ShowNums();
    }

    private static int inputStream(){
        int input = -99999999;
        String incorrectInput = "Incorrect input. You need type a number\n";
        Scanner in = new Scanner(System.in);
        do {
            try {

                input = in.nextInt();
                in.nextLine();
            } catch (InputMismatchException e){
                System.out.println(incorrectInput);
                in.nextLine();
            }
        } while (input == -99999999);
        return input;
    }
}

class minMax {
    private int min;
    private int max;

    minMax() {
        min = 0;
        max = 100;
        System.out.println("Default object created");
    }

    minMax(int minIn, int maxIn) {
        min = Math.min(minIn, maxIn);
        max = Math.max(minIn, maxIn);
        System.out.println("Object with user's preferences is created");
    }

    public void SetNums(int input) {
        if (input > Math.max(min, max)) {
            max = input;
            System.out.println("Number was assign as a max\n");
        } else {
            min = input;
            System.out.println("Number was assign as a min\n");
        }
    }

    public void SetNums(int minIn, int maxIn) {
        min = Math.min(minIn, maxIn);
        max = Math.max(minIn, maxIn);
    }

    public void ShowNums() {
        System.out.printf("Min value = %s\nMax value = %s\n\n", min, max);
    }
}
