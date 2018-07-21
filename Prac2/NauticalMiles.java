public class NauticalMiles
{
    public static void main(String args[])
    {
        final double numOfKilometers = 1.852;
        final double milesInANauticalMile = 1.150779;
        double numOfNauticalMiles = 3.2;
        System.out.println("There are " + numOfNauticalMiles * numOfKilometers + " kilometers in " +
                numOfNauticalMiles + " nautical miles.");
        System.out.println("There are " + numOfNauticalMiles * milesInANauticalMile + " miles in " +
                numOfNauticalMiles+ " nautical miles.");
    }
}
