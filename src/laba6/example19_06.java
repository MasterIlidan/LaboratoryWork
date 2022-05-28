package laba6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example19_06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int[] sourceArray;
        //создание случайного массива случайной длины
        System.out.println("Generating array with random length and random values...");
        do { //чтобы не допустить генерацию массива нулевой длины
            sourceArray = new int[random.nextInt(15)];
        } while (sourceArray.length == 0);
        System.out.printf("Number of elements in array is %s", sourceArray.length);
        System.out.println();
        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(5000);
        }
        System.out.printf("Element of array is %s", Arrays.toString(sourceArray));
        System.out.println();
        //указание, сколько элементов массива нужно
        System.out.println("How many elements of array you need? Enter a number");
        int neededElements = -1;
        while (neededElements == -1) {
            if (in.hasNextInt()) {
                neededElements = in.nextInt();
                in.nextLine();
            } else {
                System.out.println("Enter a number!");
                in.nextLine();
            }
        }
        //передача ссылки на новый массив и затем его вывод в консоль
        sourceArray = Array(sourceArray, neededElements);
        System.out.printf("New array is %s", Arrays.toString(sourceArray));
        System.out.println();
    }
    //берёт заданное количество элементов из массива и возвращает ссылку на новый
    public static int[] Array(int[] inputArray, int numsNeeded) {
        int[] newArray;
        //если аргумент 2 больше длины исходного массива
        if (numsNeeded > inputArray.length) {
            System.out.println("Number of needed elements of array is more than in array, other values will equal 0...");
            newArray = Arrays.copyOf(inputArray, numsNeeded);
        }
        //если аргумент 2 меньше длины исохдного массива
        else {
            newArray = Arrays.copyOf(inputArray, inputArray.length);
        }
        return newArray;
    }
}
