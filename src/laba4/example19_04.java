package laba4;

public class example19_04 {
    public static void main(String[] args) {
        int[][] figure = new int[5][5];
        for (int s = 0; s < figure.length; s++) {
            for (int c = 0; c < figure[s].length; c++) {
                if (c<=s) figure [s][c] = 2;
                System.out.printf("%s ", figure[s][c]);
            }
            System.out.println();
        }
    }
}
