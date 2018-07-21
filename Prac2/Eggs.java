public class Eggs
{
    public static void main(String args[])
    {
        double dozen = 3.25;
        double egg = 0.45;
        int orderedEgg = 27;
        int numOfDozenEggs = 27 / 12;
        int looseEggs = orderedEgg - (numOfDozenEggs*12);
        System.out.println("You ordered " + orderedEgg + " eggs.");
        System.out.println("That's " + numOfDozenEggs + " dozens at $" + dozen + " per dozen and " + looseEggs +
                " loose eggs at 45 cents each for a total of $" + ((numOfDozenEggs*dozen)+(looseEggs*egg)) + ".");
    }
}
