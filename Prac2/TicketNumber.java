import java.util.Scanner;

public class TicketNumber
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the six-digit ticket number : ");
        String ticketNumberInString = userInput.nextLine();
        String lastDigitInString = ticketNumberInString.substring(5,6);
        int firstFiveDigit = Integer.parseInt(ticketNumberInString.substring(0, 5));
        int lastDigit = Integer.parseInt(lastDigitInString);
        int checkTheTicket = firstFiveDigit % 7;

        if (checkTheTicket == lastDigit){
            System.out.println("The ticket number: " + ticketNumberInString + " is valid.");
        } else {
            System.out.println("The ticket number: " + ticketNumberInString + " is invalid");
        }
    }
}
