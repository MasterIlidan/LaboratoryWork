package Timus;

import java.util.Scanner;

//задача 1576 (приняло)
public class Timus7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fees fees = new Fees(in.nextLine(), in.nextLine(), in.nextLine());
        int countOfStrings = in.nextInt();
        for (int i = 0; i <= countOfStrings; i++) {
            fees.minutesToPay(in.nextLine());
        }
        fees.seeOutFeesForClient();

    }
}

class Fees {
    //плата за базовый тариф, плата за минуту
    private final int basicFee;
    private final int basicFeeForMinute;

    //плата за кобинированный тариф, пакет минут, плата за минуту при превышении
    private final int combinedFee;
    private final int combinedMinutesPck;
    private final int combinedFeeForMinute;

    //плата за безлимит
    private final int feesForUnlimited;

    private int minutesToPay = 0;
    Fees (String basic, String combined, String unlimited) {
        //парсинг данных для базового тарифа
        String[] toParse = basic.split(" ");
        basicFee = Integer.parseInt(toParse[0]);
        basicFeeForMinute = Integer.parseInt(toParse[1]);

        //парсинг данных для комбинированного тарифа
        toParse = combined.split(" ");
        combinedFee = Integer.parseInt(toParse[0]);
        combinedMinutesPck = Integer.parseInt(toParse[1]);
        combinedFeeForMinute = Integer.parseInt(toParse[2]);

        //парсинг данных для безлимитного тарифа
        toParse = unlimited.split(" ");
        feesForUnlimited = Integer.parseInt(toParse[0]);
    }
    //вывод прогноза стоимости разных тарифов на основании длительности звонков и вывод
    public void seeOutFeesForClient () {
        //вывод расчитанной цены при базовом тарифе
        System.out.printf("Basic:     %s\n", basicFee + (minutesToPay * basicFeeForMinute));
        //вывод расчитанной цены при комбинированном тарифе
        if (minutesToPay > combinedMinutesPck) System.out.printf("Combined:  %s\n", combinedFee + ((minutesToPay - combinedMinutesPck) * combinedFeeForMinute));
        else System.out.printf("Combined:  %s\n", combinedFee);
        //вывод расчитанной цены при безлимитном тарифе
        System.out.printf("Unlimited: %s", feesForUnlimited);
    }
    //подсчёт времени для оплаты
    public void minutesToPay (String input){
        if (input.equals("")) return;
        String[] toParse = input.split(":");
        int minutes = Integer.parseInt(toParse[0]);
        int seconds = Integer.parseInt(toParse[1]);
        //округление секунд, если они есть (при не нулевом значении минут)
        if (minutes > 0 && seconds > 0) minutes++;
        //округление секунд, если ноль минут (для соблюдения условия, что звонки короче 6 секунд не берутся в расчёт)
        if (minutes == 0 && seconds > 6) minutes++;
        minutesToPay += minutes;
    }
}
