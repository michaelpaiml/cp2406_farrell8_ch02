import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ChiliToGoProfit
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        NumberFormat nf = new DecimalFormat("##.###");
        final double adultMealProfit = 7 - 4.35;
        System.out.print("Enter the total amount of Adult Meal : ");
        int adultMeal = userInput.nextInt();
        double totalAdultMealProfit = adultMeal * adultMealProfit;
        final double childMealProfit = 4 - 3.10;
        System.out.print("Enter the total amount of Child Meal : ");
        int childMeal = userInput.nextInt();
        double totalChildMealProfit = childMeal * childMealProfit;
        System.out.println("Total profit collected for Adult Meal = $" + nf.format(totalAdultMealProfit));
        System.out.println("Total profit collected for Child Meal = $" + nf.format(totalChildMealProfit));
        System.out.println("The grand total profit for both Adult and Child Meal = $" + nf.format((totalAdultMealProfit + totalChildMealProfit)));
    }
}
