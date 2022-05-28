package laba6;

import java.util.Arrays;
import java.util.Random;

public class example19_09 {
    public static void main(String[] args) {
        Random random = new Random();
        char[] charArray ;
        //создание случайного массива случайной длины
        System.out.println("Generating array with random length and random values...");
        //чтобы не допустить генерацию массива нулевой длины
        do {
            charArray = new char[random.nextInt(15)];
        } while (charArray.length == 0);
        System.out.printf("Number of elements in array is %s\n", charArray.length);
        for (int i = 0; i < charArray.length; i++) {
            //нужно, чтобы массив не заполнялся неотображаемыми символами
            do{
                charArray[i] = (char) random.nextInt(255);
            } while ((charArray[i] < 33 | charArray[i] > 126) & (charArray[i] < 161 | charArray[i] > 255));
        }
        System.out.printf("Elements of array \t %s", Arrays.toString(charArray));
        System.out.println();
        //перемешивание массива по принципу первый - последний
        charArray = switchedArray(charArray);
        System.out.printf("Elements of switched %s", Arrays.toString(charArray));
    }
    //перемешивает массива по принципу первый - последний
    public static char[] switchedArray(char[] charArray) {
        char[] switchedArray = new char[charArray.length];
        //определние чётности массива
        boolean isArrayLengthEven = (charArray.length % 2) == 0;
        int charArrayLength = charArray.length - 1;
        int middleElement = Math.round(charArray.length / 2);
        //+1 нужен для дополнительной итерации цикла при нечётном массиве
        for (int i = 0; i < (charArray.length / 2) + 1; i++) {
            //нужен для присвоения значения элементу по середине при нечётности массива
            if (!isArrayLengthEven && i == middleElement) {
                switchedArray[i] = charArray[i];
                continue;
            }
            switchedArray[i] = charArray[charArrayLength];
            switchedArray[charArrayLength] = charArray[i];
            charArrayLength--;
        }
        return switchedArray;
    }
}