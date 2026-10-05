import java.util.Scanner;
public class EventDemo 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
 
        Event defaultEvent = new Event();
 
        System.out.print("Enter event number >> ");
        String number = input.nextLine().trim();
        System.out.print("Enter number of guests >> ");
        int guests = Integer.parseInt(input.nextLine().trim());
        Event userEvent = new Event(number, guests);
        displayDetails(defaultEvent);
        displayDetails(userEvent);
        input.close();
    }
 
    public static void displayDetails(Event event) 
    {
        System.out.println("Event number " + event.getEventNumber());
        System.out.println("   Guests: " + event.getGuests());
        System.out.println("   Price: $" + event.getPrice());
    }
}
 