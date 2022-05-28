package laba4;
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int plannedBudg, wastedBudg, realBudg, percent;
        float monthPlan, monthCurr, monthReal;

        do {
            System.out.print("Enter the planned budget of your project: ");
            while (!in.hasNextInt()){
                System.out.println("You entered an incorrect value.\nType an int value");
                in.next();
            }
            plannedBudg = in.nextInt();
            if (plannedBudg <= 0){
                System.out.println("Values of 0 and less are unavailible");
            }
        } while (plannedBudg <= 0);

        do {
            System.out.print("Enter new value of planned completion date in months: ");
            while (!in.hasNextFloat()){
                System.out.println("You entered an incorrect value.\n Enter the value of type float");
                in.next();
            }
            monthPlan = in.nextFloat();
            if (monthPlan <= 0) System.out.println("Values of 0 and less cannot be entered");
        } while (monthPlan <= 0);

        do{
            System.out.print("Enter a current wasted budget: ");
            wastedBudg = in.nextInt();
        } while (wastedBudg < 0);

        do{
            System.out.print("How much months have passed from the start of a project? :");
            monthCurr = in.nextFloat();
        } while (monthCurr > monthPlan || monthCurr <= 0);

        do{
            System.out.print("How much percent’s of a project is finished by now?): ");
            percent = in.nextInt();
        } while (percent < 0 || percent > 100);

        monthReal = (100 * monthCurr) / percent;

        if (monthReal <= monthPlan){
            System.out.println("There is no time delay in project");
        }
        else {
            System.out.printf("There would be a time delay of %.1f months", (monthReal - monthPlan));
        }
        System.out.println();
        realBudg = (100 * wastedBudg) / percent;

        if (realBudg <= plannedBudg) System.out.println("There is no overpayment for your project");

        else {
            realBudg = -plannedBudg;
            System.out.println("Overpayment would reach values of" + realBudg + " у. е.");
        }

    }
}
