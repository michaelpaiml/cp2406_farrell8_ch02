import java.util.Scanner;

public class ChiliToGo
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        final int adultMealPrice = 7;
        System.out.print("Enter the total amount of Adult Meal : ");
        int adultMeal = userInput.nextInt();
        int totalAdultMealPrice = adultMeal * adultMealPrice;
        final int childMealPrice = 4;
        System.out.print("Enter the total amount of Child Meal : ");
        int childMeal = userInput.nextInt();
        int totalChildMealPrice = childMeal * childMealPrice;
        System.out.println("Total money collected for Adult Meal = $" + totalAdultMealPrice);
        System.out.println("Total money collected for Child Meal = $" + totalChildMealPrice);
        System.out.println("Total money collected for both Adult and Child Meal = $" + (totalAdultMealPrice + totalChildMealPrice));
    }
}