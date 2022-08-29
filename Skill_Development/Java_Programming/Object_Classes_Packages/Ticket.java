public class Ticket {
    private int ticketId;
    private int price;
    static int availableTickets;
    
    public int calculateTicketCost(int nooftickets) {
        if(availableTickets>=nooftickets)
        {
            availableTickets -= nooftickets;
            int totalAmount = nooftickets*price;
            return totalAmount;
        }
        else  {  
            return -1;}
    }
    
    public int getTicketId(){
        return ticketId;
	}
	public void setTicketId(int ticketId){
		this.ticketId = ticketId;
	}
	
	public int getPrice(){
        return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getAvailableTickets(){
        return availableTickets;
	}
	public void setAvailableTickets(int availableTickets){
		this.availableTickets = availableTickets;
	}
}
