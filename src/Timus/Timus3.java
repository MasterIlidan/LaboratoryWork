package Timus;

import java.util.Scanner;

//задача 2142 (приняло)
public class Timus3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Valya task = new Valya(in.nextLine());
        if (task.isThatAMagic(in.nextLine())) System.out.print("It is a kind of magic");
        else System.out.print("There are no miracles in life");
    }
}

class Valya {
    private long redMana;
    private long blueMana;
    private long redOrBlueMana;

    Valya(String input) {
        //возвращает массив строк со значениями, разделитель - пробел
        String[] text = input.split(" ");
        //присвоение значений (по условиям задачи они в заданном порядке)
        redMana = Long.parseLong(text[0]);
        blueMana = Long.parseLong(text[1]);
        redOrBlueMana = Long.parseLong(text[2]);
    }

    public boolean isThatAMagic(String input) {
        //возвращает массив строк со значениями, разделитель - пробел
        String[] text = input.split(" ");
        //присвоение значений (по условиям задачи они в заданном порядке)
        long redManaNeeded = Long.parseLong(text[0]);
        long blueManaNeeded = Long.parseLong(text[1]);
        long redOrBlueManaNeeded = Long.parseLong(text[2]);
        //проверка, хватает ли маны для освоения заклинания
        redMana -= redManaNeeded;
        if (redMana < 0){
            redOrBlueMana -= (redMana * -1);
            redMana = 0;
            if (redOrBlueMana < 0) return false;
        }
        blueMana -= blueManaNeeded;
        if (blueMana < 0){
            redOrBlueMana -= (blueMana * -1);
            blueMana = 0;
            if (redOrBlueMana < 0) return false;
        }
        if (redOrBlueManaNeeded != 0){
            redOrBlueMana -= redOrBlueManaNeeded;
            if (redOrBlueMana < 0){
                if (redMana > 0) {
                    redOrBlueMana += redMana;
                    redMana = 0;
                }
                if (blueMana > 0){
                    redOrBlueMana += blueMana;
                    blueMana = 0;
                }
                if (redOrBlueMana < 0) return false;
            }
        }
        return true;
    }
}