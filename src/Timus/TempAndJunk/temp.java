package Timus.TempAndJunk;

import java.io.IOException;

class temp {
    public static void main(String[] args) throws IOException {
        int j = -42;
        char i;
        j = j<0?j:j;
        if (j > 42 & j++ > 0) {
            System.out.print(j + " ");
            System.out.println();
        } else System.out.print(j + " хуй");
        i = (char) System.in.read();


    }
}