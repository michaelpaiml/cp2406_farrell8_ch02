import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MinutesConversion
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        NumberFormat nf = new DecimalFormat("##.###");
        System.out.print("Enter the number of minutes : ");
        int numOfMinutes = userInput.nextInt();
        int minutesToHours = numOfMinutes / 60;
        double minutesToDays = numOfMinutes / (60.0 * 24);
        System.out.println(numOfMinutes + " minutes equal " + minutesToHours + " hours and equals " + nf.format(minutesToDays) + " days.");
    }
}
