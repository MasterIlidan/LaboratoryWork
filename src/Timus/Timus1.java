package Timus;

import java.util.Scanner;
import java.util.Stack;

//задача 1563 (приняло)
public class Timus1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shops shops = new Shops();
        int countOfShops = in.nextInt();
        for (int i = 0; i <= countOfShops; i++) {
            shops.checkToMatch(in.nextLine());
        }
        int countOfBayans = shops.getCountOfBayans();
        System.out.print(countOfBayans);
    }

}

class Shops {
    private Stack<String> namesOfShops;
    private int countOfBayans = 0;

    Shops () {
        namesOfShops = new Stack<>();
    }

    public void checkToMatch (String input) {
        if (namesOfShops.search(input) != -1 ) {
            countOfBayans++;
        }
        else namesOfShops.push(input);
    }

    public int getCountOfBayans() {
        return countOfBayans;
    }
}
