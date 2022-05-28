package Timus.TempAndJunk;

import java.util.Arrays;
import java.util.Scanner;

//задача 2144 (не хочет)
public class Timus5 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //получение количества коробок с супергероями и создание стека с коробками
        int countOfBoxes = in.nextInt();
        in.nextLine();
        //инициаiлизация стека коробок
        BoxStack boxStack = new BoxStack(countOfBoxes);
        //заполнение стека коробок из введённых данных
        for (int i = 0; i < countOfBoxes; i++) {
            boxStack.setBoxes(in.nextLine());
        }
        boxStack.sorting();

    }
}

class BoxStack {
    //массив хранения всех коробок
    private BoxSuperHero[] boxes;
    //индекс следующего свободного элемента
    private int index = 0;

    BoxStack(int countOfBoxes) {
        boxes = new BoxSuperHero[countOfBoxes];
        //System.out.printf("BoxStack initialized with %s length", boxes.length);
        //System.out.println();
    }

    public void setBoxes(String input) {
        String[] toParse = input.split("\t");
        //массив парсинга
        int[] parsedNums = new int[toParse.length];
        //парсинг
        for (int i = 0; i < toParse.length; i++) {
            parsedNums[i] = Integer.parseInt(toParse[i]);
        }
        //создание коробки с супергероями, где 0-й элемент количество фигурок в коробке, остальное - размер фигурок
        boxes[index] = new BoxSuperHero(index, parsedNums[0], Arrays.copyOfRange(parsedNums, 1, parsedNums.length));
        //вывод в консоль созданную коробку
        //System.out.printf("Box %s has values ", index);
        //boxes[index].outAllValues();
        index++;
    }

    //сортировка по условию задачи
    public void sorting() throws Exception {
        //временный массив, полная копия основного, работать будем с ним
        BoxSuperHero[] temp = Arrays.copyOf(boxes, boxes.length);
        //итоговый массив, отсортирован по условию задачи
        BoxSuperHero[] result = new BoxSuperHero[boxes.length];
        //индекс следущего свободного элемента
        int resultIndex = 0;
        int currentMinValue = -1; //текущее минимальное значение
        //получение минимального и максимального значения высоты фигурки в каждой коробке и её id
        String[] minMaxStrings = new String[temp.length];
        //заполнение массива
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == null) continue;
            minMaxStrings[i] = temp[i].getMinMaxHeight();
            if (minMaxStrings[i].equals("NO")) {
                System.out.print("NO");
                return;
            }
        }

        //непосредественно сортировка
        int id = -1;
        for (int i = 0; i < boxes.length; i++) {
            int min = 10000;
            int max = -1; //максимальное значение в коробке, если оно будет назначено, после проходки оно будет минимальным числом
            //проходка по всем коробкам и выискивание минимального значения
            for (int j = 0; j < minMaxStrings.length; j++) {
                if (minMaxStrings[j] == null) continue;
                String[] tempMinMax = minMaxStrings[j].split(" ");
                int currentNum = Integer.parseInt(tempMinMax[0]);
                if (currentNum < min) {
                    min = currentNum;
                    if (tempMinMax.length == 3) max = Integer.parseInt(tempMinMax[1]);
                    if (tempMinMax.length == 2) id = Integer.parseInt(tempMinMax[1]);
                    else if (tempMinMax.length == 3) id = Integer.parseInt(tempMinMax[2]);
                }

            }

            //что-то пошло не так
            /*
            if (id == -1) {
                //System.out.println("Error occurred");
                return;
            }
*/

            //если новое значение меньше минимального
            if (min < currentMinValue) {
                System.out.print("NO");
                return;
            }
            //занесение нового элемента
            result[resultIndex] = boxes[id];
            resultIndex++;
            //удаление эемента, так как он обработан
            minMaxStrings[id] = null;
            //если минимальное и максимальное значение в коробке отличается
            if (max != -1) currentMinValue = max;
            else currentMinValue = min;
        }
        //присвоение нового результата
        boxes = result;
        System.out.print("YES");
        /*
        System.out.println("Stack sorted");
        for (int i = 0; i < boxes.length; i++) {
            System.out.printf("Box %s has values ", i);
            boxes[i].outAllValues();
        }
        */
    }
/*
Чё я хочу сделать та. Надо находить минимальное значение высоты фигурки и делать его минимально возможножным значением, если минимальная
высота фигурки меньше, чем минимально возможное, то уборка невозможна. А так постоянно находить минимальную высоту фигурки, а за новую минимально
возможную высоту брать самую высокую фигурку в коробке. Затем по id коробки выставлять их в новый массив. Обработанную коробку нужно удалить
через метод deleteBox
 */
}

class BoxSuperHero {
    private final int countOfFigures;
    private final int[] heightOfFigures;
    //id коробки
    protected final int id;

    //установка значений
    BoxSuperHero(int id, int countOfFigures, int[] heightOfFigures) {
        this.countOfFigures = countOfFigures;
        this.heightOfFigures = heightOfFigures;
        this.id = id;
    }
/*
    //вывести значения экземпляра коробки
    public void outAllValues() {
        System.out.printf("count of figures %s, their height %s", countOfFigures, Arrays.toString(heightOfFigures));
        System.out.println();
    }
*/
    public String getMinMaxHeight() throws Exception {
        int[] temp = Arrays.copyOf(heightOfFigures, heightOfFigures.length);
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == heightOfFigures[i]) continue;
            Exception IllegalArgumentException = new Exception();
            throw IllegalArgumentException;
            //return "NO";
        }


        if (heightOfFigures[0] == heightOfFigures[heightOfFigures.length - 1])
            return (heightOfFigures[0] + " " + id);
        else return (heightOfFigures[0] + " " + heightOfFigures[heightOfFigures.length - 1] + " " + id);
    }
}
