package Timus;

import java.util.Scanner;

//задача 1293 (приняло)
public class Timus2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        ThoriumSulfide task = new ThoriumSulfide();
        task.setValues(in.nextLine());
        result = task.outResult();
        System.out.print(result);
    }
}

class ThoriumSulfide {
    private int countOfPanels;
    private int length;
    private int wight;
    private int index = 0;

    //установка значений
    public void setValues(String input) {
        char[] inputToChar = input.toCharArray(); //полученная строка
        char[] temp = new char[5]; //временный массив, куда будут попадать найденные числа из строки
        int charArrayCount = 0; //счётчик следующего пустого элемента временного массива
        int countOfFoundNums = 0; //счётчик найденных чисел

        for (int i = 0; i <= inputToChar.length; i++){
            //фиксация последнего числа в строке, после него начинается обработка слудующей строки
            if (i == inputToChar.length){
                String numToSet = new String(temp, 0, countOfFoundNums); //создание строки из найденных чисел
                if (index == 0) countOfPanels = Integer.parseInt(numToSet);
                if (index == 1) wight = Integer.parseInt(numToSet);
                if (index == 2) length = Integer.parseInt(numToSet);
                index++;
                break;
            }

            //если найден пробел
            if (inputToChar[i] == 32) {
                String numToSet = new String(temp, 0, countOfFoundNums); //создание строки из найденных чисел
                if (index == 0) countOfPanels = Integer.parseInt(numToSet);
                if (index == 1) wight = Integer.parseInt(numToSet);
                if (index == 2) length = Integer.parseInt(numToSet); //парсинг чисел в массив
                //сброс счётчиков
                charArrayCount = 0;
                countOfFoundNums = 0;
                index++;
                continue;
            }
            //если найдено число
            temp[charArrayCount] = inputToChar[i];
            charArrayCount++;
            countOfFoundNums++;
        }
        //System.out.println(Arrays.toString(diagonalPixels));
    }

    public int outResult() {
        return (countOfPanels * (wight * length)) * 2;
    }
}