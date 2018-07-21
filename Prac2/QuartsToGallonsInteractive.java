import java.util.Scanner;

public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        final int quartsInAGallon = 4;
        System.out.print("Enter the number or quarts needed : ");
        int neededQuarts = userInput.nextInt();
        System.out.println("A job that needs " + neededQuarts + " quarts requires " + neededQuarts / quartsInAGallon
                + " gallons plus " + neededQuarts % quartsInAGallon + " quarts.");
    }
}
