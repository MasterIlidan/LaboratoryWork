package laba4;

import java.util.Scanner;

public class example19_09 {
    public static void output(String out) {
        System.out.println(out);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int shift;
        String textToEncrypt; //вводимый текст

        output("Введите предложение, которое нужно зашифровать, затем ключ шифрования");
        do {
            textToEncrypt = in.nextLine();
        } while (textToEncrypt == null); //ввод текста для шифрования
        output("Введите ключ шифрования: ");
        shift = in.nextInt();
        output("Преобразованный текст: ");
        output(encrypt.getEncryptString(textToEncrypt, shift));
        end:
        while (true) {
            char[] choose;

            output("Выполнить обратное преобразование?(y/n)");
            String inputChoose = in2.nextLine();
            choose = inputChoose.toCharArray();
            switch (choose[0]) {
                case 89 | 121: {
                    String descryptedString = descrypt.getDescryptString(encrypt.getEncryptString(textToEncrypt, shift), shift);
                    output(descryptedString);
                    break end;
                }
                case 78 | 110: {
                    output("\nДо свидания!");
                    return;
                }
                default: {
                    output("Неверный ввод");
                    break;
                }
            }
        }
        output("\nДо свидания!");
    }

    public static class encrypt {
        public static String getEncryptString(String encryptString, int shift) {
            char[] ArrayChar = encryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
            long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
            char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
            //в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
            for (int i = 0; i < ArrayChar.length; i++) {
                ArrayInt[i] = ArrayChar[i] + shift; // прибавляем к символу с индексом i сдвиг
                ArrayCharNew[i] = (char) ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
            }
            encryptString = new String(ArrayCharNew); // преобразовываем новый массив символов в строку
            return encryptString; // возвращаем строку в метод из которого был вызван текущий метод
        }
    }

    public static class descrypt { //тоже, что и encrypt, но сдвиг в противоположную сторону
        public static String getDescryptString(String encryptedText, int shift) {
            char[] ArrayChar = encryptedText.toCharArray();
            long[] ArrayInt = new long[ArrayChar.length];
            char[] ArrayCharNew = new char[ArrayChar.length];
            for (int i = 0; i < ArrayChar.length; i++) {
                ArrayInt[i] = ArrayChar[i] - shift;
                ArrayCharNew[i] = (char) ArrayInt[i];
            }
            encryptedText = new String(ArrayCharNew);
            return encryptedText;
        }
    }
}
