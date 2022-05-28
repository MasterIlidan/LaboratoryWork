package Timus.TempAndJunk;


import java.io.*;
import java.util.ArrayList;
//import java.util.Scanner;

public class Timus8temp {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static void main(String[] args) throws IOException {
        //StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        //Scanner in = new Scanner(System.in);
        int countOfActions = nextInt();
        moneyStacktemp moneyStack = new moneyStacktemp();
        for (int i = 0; i < countOfActions; i++) moneyStack.stackAPI(nextInt());
        //moneyStack.popped();
    }
    public static int nextInt () throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
}

class moneyStacktemp {

    private ArrayList moneyStack = new ArrayList<>();
    private ArrayList moneyStacktemp;
    private boolean isSwitch = false;
    private int countOfCopies = 0;
    private final int boundOfList = 1000;

    //какое дейсвтие нужно провести со стеком?
    public void stackAPI (int action) {
        if (action > 0) {
            push(action, isSwitch);
            countOfCopies = 0;
        }
        if (action == 0) {
            if (countOfCopies > 2) return;
            copy();
            countOfCopies++;
        }
        if (action == -1) {
            pop(isSwitch);
            countOfCopies = 0;
        }
    }
    //положить монетку в стопку
    private void push (int type, boolean isSwitch) {
        //первый стек достиг 1000
        if (moneyStack.size() > boundOfList) {
            //System.out.println("Overload! Switching...");
            isSwitch = true;
            pushOver1000(type);
            return;
        }
        moneyStack.add(type);
        //System.out.println("Было " + Arrays.toString(temp));
    }
    private void pushOver1000 (int type) {
        if (moneyStacktemp == null) moneyStacktemp = new ArrayList<>();
        moneyStacktemp.add(type);
    }
    //извлечение монетки
    private void pop (boolean isSwitch){
        if (moneyStack.size() > boundOfList & isSwitch) {
            //System.out.println("Overload! Switching...");
            this.isSwitch = true;
            popOver1000();
            return;
        }
        System.out.println(moneyStack.get(moneyStack.size() - 1));
        moneyStack.remove(moneyStack.size() - 1);
    }
    private void popOver1000 () {
        if (moneyStacktemp.size() == 0) {
            isSwitch = false;
            pop(isSwitch);
            return;
        }
        System.out.println(moneyStacktemp.get(moneyStacktemp.size() - 1));
        moneyStacktemp.remove(moneyStacktemp.size() - 1);
    }
    //копирование
    private void copy () {
        if (moneyStack.size() > boundOfList){
            //System.out.println("Overload! Switching...");
            isSwitch = true;
            copyOver1000();
            return;
        }
        moneyStack.addAll(moneyStack.size(), moneyStack);
        //System.out.println("стало " + Arrays.toString(moneyStack));
    }
    private void copyOver1000 () {
        if (moneyStacktemp == null) {
            moneyStacktemp = new ArrayList<>();
            moneyStacktemp.addAll(moneyStack);
        }
        else moneyStacktemp.addAll(moneyStacktemp.size(), moneyStacktemp);
    }

}
