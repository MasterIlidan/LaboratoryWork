package laba4;

import java.util.Random;

public class example19_07 {
    public static void main(String[] args) {
        int[][] snake = new int[10][10];
        Random random = new Random();
        for (int i = 1; i < snake.length; i++) {

            for (int j = 0; j < snake.length; j++) {
                if (i % 2 == 0 & i % 2 == 0) {
                    for (int u = 0; u < snake.length - 1; u++) {
                        System.out.printf("%s\t", snake[i][j] = 0);
                    }
                    System.out.printf("%s\t", snake[i][snake.length - 1] = random.nextInt(50));
                    break;
                }
                System.out.printf("%s\t", snake[i][j] = random.nextInt(50));
            }
            System.out.println();
        }
    }
}
