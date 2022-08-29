import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter movie name");
	    String movieName = sc.next();
	    
	    System.out.println("Enter no of bookings");
	    int noofBookings = sc.nextInt();
	    Ticket obj = new Ticket();

    	System.out.println("Enter the available tickets");
    	int availableTickets = sc.nextInt();
    	obj.setAvailableTickets(availableTickets);    
    	for(int i = 0; i<noofBookings; i++) 
	    { 
    	    System.out.println("Enter the ticketid");
    	    int ticketId = sc.nextInt();
    	    
    	    System.out.println("Enter the price");
    	    int price = sc.nextInt();
    	    
    	    System.out.println("Enter the no of tickets");
    	    int nooftickets = sc.nextInt(); 
	    
    	    obj.setTicketId(ticketId);
    	    obj.setPrice(price);
    	    availableTickets = obj.getAvailableTickets();
    	    
    	    System.out.println("Available tickets: " + availableTickets);
    	    
    	    int totAmount = obj.calculateTicketCost(nooftickets);
    	    availableTickets = obj.getAvailableTickets();

    	    if(totAmount>0) {
    	        System.out.println("Total amount: " + totAmount);
    	    }
    	    else {
    	        System.out.println("Tickets are not available");
    	        continue;
    	    }
    	        
    	    if(availableTickets == 0)
    	    {
    	        System.out.println("House full");
    	        break;
    	    }
    	    
    	    System.out.println("Available ticket after booking: " + availableTickets);
    	    
	    }
	}
}









