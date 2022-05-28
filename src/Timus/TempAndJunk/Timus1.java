package Timus.TempAndJunk;

import java.util.Arrays;
import java.util.Scanner;
//задача 1313 (не принимает почему-то)
public class Timus1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfStrings = in.nextInt(); //обработка первой строки, получение количества строк
        in.nextLine();
        Pixels pixels = new Pixels(countOfStrings);
        int[] result;
        for (int i = 0; i < countOfStrings; i++) pixels.setDiagonalPixels(in.nextLine()); //передача строк методу на обработку
        in.close();
        result = pixels.outDiagonalPixels(); //получение результата
        for (int i = 0; i < result.length; i++){
            if (i == result.length - 1) System.out.print(result[i]);
            else System.out.print(result[i] + " ");
        }
    }
}

class Pixels {

    private int diagonalPixelsIndex = 0; //индекс пустого элемента массива с диагональными пикселями
    private int[] diagonalPixels; //пиксели в диагональном представлении (результат)

    //инициализация массива квадратных пикселей
    Pixels(int countOfStrings) {
        diagonalPixels = new int[countOfStrings * countOfStrings];
    }

    //установка значений в диагональный массив
    public void setDiagonalPixels(String input) {
        char[] inputToChar = input.toCharArray(); //полученная строка
        char[] temp = new char[5]; //временный массив, куда будут попадать найденные числа из строки
        int charArrayCount = 0; //счётчик следующего пустого элемента временного массива
        int countOfFoundNums = 0; //счётчик найденных чисел

        for (int i = 0; i <= inputToChar.length; i++){
            //фиксация последнего числа в строке, после него начинается обработка слудующей строки
            if (i == inputToChar.length){
                String numToDiagonalPixelsArray = new String(temp, 0, countOfFoundNums); //создание строки из найденных чисел
                diagonalPixels[diagonalPixelsIndex] = Integer.parseInt(numToDiagonalPixelsArray);
                diagonalPixelsIndex++;
                break;
            }

            //если найден пробел
            if (inputToChar[i] == 32 | inputToChar[i] == 9) {
                String numToDiagonalPixelsArray = new String(temp, 0, countOfFoundNums); //создание строки из найденных чисел
                diagonalPixels[diagonalPixelsIndex] = Integer.parseInt(numToDiagonalPixelsArray); //парсинг чисел в массив
                //сброс счётчиков
                charArrayCount = 0;
                countOfFoundNums = 0;
                diagonalPixelsIndex++;
                continue;
            }
            //если найдено число
            temp[charArrayCount] = inputToChar[i];
            charArrayCount++;
            countOfFoundNums++;
        }
        //System.out.println(Arrays.toString(diagonalPixels));
    }

    public int[] outDiagonalPixels() {
        Arrays.sort(diagonalPixels);
        return diagonalPixels;
    }
}