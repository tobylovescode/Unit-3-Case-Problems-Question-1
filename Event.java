public class Event 
{
    public final static int PRICE_PER_GUEST = 35;
    public final static int LARGE_EVENT = 50;
 
    private String eventNumber;
    private int guests;
    private int price;
 
   
    public Event() 
    {
        this("A000", 0);
    }
    public Event(String eventNumber, int guests) 
    {
        setEventNumber(eventNumber);
        setGuests(guests);
    }
    public void setEventNumber(String eventNumber) 
    {
        this.eventNumber = eventNumber;
    }
    public void setGuests(int guests) 
    {
        this.guests = guests;
        price = guests * PRICE_PER_GUEST;
    }
    public String getEventNumber() 
    {
        return eventNumber;
    }
    public int getGuests() 
    {
        return guests;
    }
 
    public int getPrice() 
    {
        return price;
    }
}