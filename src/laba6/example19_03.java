package laba6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example19_03 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int[] inputNums = new int[5];
        //создание случайного массива случайной длины
        System.out.println("Generating array with random values...");
        int[] randomNums;
        //чтобы не допустить генерацию массива нулевой длины
        do{
            randomNums = new int[random.nextInt(20)];
        } while (randomNums.length == 0);
        System.out.printf("Number of elements in array is %s\n", randomNums.length);
        //заполнение массива случайными числами
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(5000);
        }
        staticMethods.minmaxMethod(randomNums);
        System.out.println("Done");
        //ввод чисел пользователем
        System.out.println("Enter 5 random numbers");
        for (int i = 0; i < inputNums.length; i++) {
            if (!in.hasNextInt()) break;
            inputNums[i] = in.nextInt();
            in.nextLine();
        }
        in.close();
        //вывод чисел введённых пользователем
        System.out.printf("Your array is %s", Arrays.toString(inputNums));
        System.out.println();
        staticMethods.minmaxMethod(inputNums);
    }
}

class staticMethods {
    public static void minmaxMethod(int... v) {
        Arrays.sort(v);
        for (int x : v) {
            System.out.printf("%s ", x);
        }
        System.out.println();
        System.out.printf("Min value is %s\n", v[0]);
        System.out.printf("Max value is %s\n", v[v.length-1]);

        double sum = 0;
        for (int x : v) {
            sum += x;
        }
        sum /= v.length;
        System.out.printf("Average value is %s\n", sum);
    }
}
