package Timus.TempAndJunk;

import java.io.*;
import java.util.Arrays;

public class Timus8 {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static void main(String[] args) throws IOException {
        //StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        //Scanner in = new Scanner(System.in);
        int countOfActions = nextInt();
        moneyStack moneyStack = new moneyStack(countOfActions);
        for (int i = 0; i < countOfActions; i++) moneyStack.stackAPI(nextInt());
        moneyStack.popped();
    }
    public static int nextInt () throws IOException {
        in.nextToken();
        return (int) in.nval;
    }
}

class moneyStack {
    private int[] moneyStack;

    //индекс следующего свободного элемента
    private int index = 0;
    //TEMP

    private int[] popped = new int[4];
    private int poppedIndex = 0;

    //TEMP
    //инициализация стека
    moneyStack (int countOfActions)  {
        moneyStack = new int[10];
    }
    //какое дейсвтие нужно провести со стеком?
    public void stackAPI (int action) {
        if (action > 0) push(action);
        if (action == 0) copy();
        if (action == -1) pop();
    }
    //положить монетку в стопку
    private void push (int type) {
        if (index > moneyStack.length - 1) moneyStack = Arrays.copyOf(moneyStack, moneyStack.length + 50 );
        //System.out.println("Было " + Arrays.toString(temp));

        moneyStack[index] = type;
        index++;
    }
    //извлечение монетки
    private void pop (){
        //System.out.println(moneyStack[index -= 1]);

        //temp
        if (poppedIndex > popped.length - 1) {
            int[] temp = popped.clone();
            popped = Arrays.copyOf(temp, temp.length + 50);
        }
        popped[poppedIndex] = moneyStack[index -= 1];
        moneyStack[index] = 0;
        poppedIndex++;
        //temp
    }
    //копирование
    private void copy () {
        //обрезка нулей
        int tempIndex = 0;
        for (int x:moneyStack) {
            if (x == 0) break;
            tempIndex++;
        }
        moneyStack = Arrays.copyOfRange(moneyStack, 0, tempIndex);

        moneyStack = Arrays.copyOf(moneyStack, moneyStack.length * 2);
        //System.out.println("Было " + Arrays.toString(temp));
        for (int i = 0; i < tempIndex; i++){
            moneyStack[index] = moneyStack[i];
            index++;
        }
        //System.out.println("стало " + Arrays.toString(moneyStack));
    }

    //temp
    public void popped () {
        //System.out.println("Begin output");
        for (int x:popped) {
            if (x == 0) break;
            System.out.println(x);
        }
    }
    //temp

}
