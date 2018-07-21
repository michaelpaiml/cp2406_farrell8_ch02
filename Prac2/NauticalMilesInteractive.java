import java.util.Scanner;

public class NauticalMilesInteractive
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        final double numOfKilometers = 1.852;
        final double milesInANauticalMile = 1.150779;
        System.out.print("Enter the Number of Nautical Miles : ");
        double numOfNauticalMiles = userInput.nextDouble();
        System.out.println("There are " + numOfNauticalMiles * numOfKilometers + " kilometers in " +
                numOfNauticalMiles + " nautical miles.");
        System.out.println("There are " + numOfNauticalMiles * milesInANauticalMile + " miles in " +
                numOfNauticalMiles+ " nautical miles.");
    }
}
