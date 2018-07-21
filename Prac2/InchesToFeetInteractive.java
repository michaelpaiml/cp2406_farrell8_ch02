import java.util.Scanner;

public class InchesToFeetInteractive
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of inches : ");
        int numOfInches = userInput.nextInt();
        final int inchesInAFeet = 12;
        System.out.print(numOfInches + " inches become " + numOfInches/inchesInAFeet + " foot and " + numOfInches%inchesInAFeet + " inches.");
    }
}
