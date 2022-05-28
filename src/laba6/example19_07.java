package laba6;

import java.util.Arrays;
import java.util.Random;

public class example19_07 {
    public static void main(String[] args) {
        Random random = new Random();
        //создание символьного массива случайной длины
        System.out.println("Generating array with random length and random values...");
        char[] charArray;
        do{ //чтобы не допустить генерацию массива нулевой длины
            charArray = new char[random.nextInt(20)];
        } while (charArray.length == 0);
        System.out.printf("Number of elements in array is %s\n", charArray.length);
        System.out.print("Char array contain ");
        for (int i = 0 ; i < charArray.length; i++){
            charArray[i] = (char) random.nextInt(100);
            System.out.printf("%s ", charArray[i]);
        }
        System.out.println();

        //передача ссылки на новый массив
        int[] charToIntArray = convertCharToInt(charArray);
        System.out.printf("New int array is %s", Arrays.toString(charToIntArray));
        System.out.println();
    }
    public static int[] convertCharToInt(char[] charArray){
        int[] charToIntArray = new int[charArray.length];
        for (int i = 0; i < charToIntArray.length; i++){
            charToIntArray[i] = charArray[i];
        }
        return charToIntArray;
        }
    }
