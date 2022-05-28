package Timus;

import java.util.Scanner;

//задача 1086 (приняло)
public class Timus4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleNums.setSimpleNums();
        //получение количества строк
        int countOfNums = Integer.parseInt(in.nextLine());
        //возврат простого числа
        int[] result = new int[countOfNums];
        for (int i = 0; i < countOfNums; i++){
            result[i] = SimpleNums.returnNum(Integer.parseInt(in.nextLine()));
        }
        //вывод чисел
        for (int i = 0; i < result.length; i++){
            if (i == (countOfNums - 1)) System.out.print(result[i]);
            else System.out.printf("%s ", result[i]);
        }
    }
}
class SimpleNums{
    //массив простых чисел
    static int[] simpleNums = new int[15001];

    //вычисление простых числе и заполнение массива
    public static void setSimpleNums() {
        simpleNums[1] = 2; simpleNums[2] = 3; simpleNums[3] = 5; simpleNums[4] = 7;
        int index = 5;
        int currentNum = 11; //проверяется это число
        int temp;//делится на это число
        IfFoundNotSimpleNum: while (index < simpleNums.length){
            //проверка числа делением на числа до 100
            temp = 3; // сброс делителя
            while (temp < 500){
                //если число разделилось, значит оно не простое (но не нужно позволять делиться самому на себя)
                if (currentNum % temp == 0 & temp != currentNum) {
                    currentNum += 2;
                    continue IfFoundNotSimpleNum;
                }
                temp += 2;
            }
            //если число прошло проверку
            simpleNums[index] = currentNum;
            index++;
            currentNum += 2;
        }
    }
    public static int returnNum(int index){
        return simpleNums[index];
    }
}
