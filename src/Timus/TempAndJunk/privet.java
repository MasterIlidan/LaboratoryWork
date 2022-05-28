package Timus.TempAndJunk;

import java.util.Scanner;

public class privet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        System.out.println();
    }

    //задача 1292
    public static class Timus5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int countOfTests = in.nextInt();
            in.nextLine();

            //
            String buffer1;
            String buffer2 = "";
            int answer = 0;
            //

            //ArrayList<Integer> toGet = new ArrayList<>(countOfTests);
            for (int i = 0; i < countOfTests; i++) {
                buffer1 = in.nextLine();
                if (buffer1.equals(buffer2)) {
                    System.out.println(answer);
                    continue;
                }
                answer = getAnswer(buffer1);
                buffer2 = buffer1;
                //toGet.add(getAnswer(in.nextLine()));
                System.out.println(answer);
            }/*
            Integer[] toGetArray = toGet.toArray(new Integer[toGet.size()]);
            for (int x:toGetArray) {
                System.out.println(x);
            }
            */

        }

        private static int getAnswer(String input) {
            String[] toParse = input.split(" ");
            int numberOfBase = Integer.parseInt(toParse[0]);
            int secretMarsianKey = Integer.parseInt(toParse[1]);
            int length = Integer.parseInt(toParse[2]);
            int lengthFromPastToNeeded = lengthFromPastToNeeded(numberOfBase, secretMarsianKey);
            //System.out.println(lengthFromPastToNeeded);
            return lengthFromPastToNeeded - length;
        }
    //вычисление длины от первой базы до нужной
        private static int lengthFromFirstToNeeded(int numberOfBase, int secretMarsianKey) {
            int lengthFromFirstToNeeded = 0;
            for (int i = 2; i <= numberOfBase; i++) {
                if (i == 2) {
                    lengthFromFirstToNeeded = secretMarsianKey;
                    continue;
                }
                if (i == 3) {
                    lengthFromFirstToNeeded = desyatki(secretMarsianKey);
                    continue;
                }
                lengthFromFirstToNeeded = desyatki(lengthFromFirstToNeeded);
            }
            return lengthFromFirstToNeeded;

            /*
            if (numberOfBase == 2) return secretMarsianKey;
            if (numberOfBase == 3) return (desyatki(secretMarsianKey));
            int desyatki = desyatki(lengthFromFirstToNeeded(numberOfBase-1, secretMarsianKey));
            return desyatki;

             */
        }
        private static int lengthFromPastToNeeded(int numberOfBase, int secretMarsianKey) {
            int desyatki = desyatki(lengthFromFirstToNeeded(numberOfBase, secretMarsianKey));
            return desyatki;
        }

    //почленно суммирует число, то есть 156 это 1 + 5 + 6 = 12
        private static int desyatki(int num) {
            String desyatkiString = Integer.toString(num);
            char[] desyatkiChar = desyatkiString.toCharArray();
            int sum = 0;
            int currentNum;
            for (char x : desyatkiChar) {
                currentNum = Short.parseShort(String.valueOf(x));
                currentNum = (int) Math.pow(currentNum, 3);
                sum += currentNum;
            }
            return sum;
        }
    }
}





/*
public class test {
     public static void main(String[] args) {
        one:
        {
            while (true) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("pool" + i + "· ");
                }
                for (int j = 0; j < 100; j++) {
                    if (j == 10) break one; //ОШИБКА!
                    System.out.print(j + " ");
                }
            }
        }
    }
}
*/