import java.util.Scanner;

public class Dollars
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the total amount of dollar : $");
        int totalAmount = userInput.nextInt();
        int numberOfTwenties = totalAmount / 20;
        totalAmount = totalAmount - numberOfTwenties * 20;
        int numberOfTens = totalAmount / 10;
        totalAmount = totalAmount - numberOfTens * 10;
        int numberOfFives = totalAmount / 5;
        totalAmount = totalAmount - numberOfFives * 5;
        int numberOfOnes = totalAmount;

        System.out.println("Number of 20s: " + numberOfTwenties);
        System.out.println("Number of 10s: " + numberOfTens);
        System.out.println("Number of 5s: " + numberOfFives);
        System.out.println("Number of 1s " + numberOfOnes);


    }
}
