public class CardPoints{
    private int cardId;
    private String holderName;
    private int balancePoints;
    
    // Calculate the withdrawPoints based on the points
    public boolean withdrawPoints(int points) {
        if(balancePoints>=points){
             balancePoints = balancePoints - points;
             System.out.println("Balance points after used:"+balancePoints);
            return true;
        }
        else {
             System.out.println("Sorry!!! No enough points");
             return false;
        }
    }
    
    // Include the getters and setters method for all the attributes.
    public int getCardId(){
        return cardId;
	}
	public void setCardId(int cardId){
		this.cardId = cardId;
	}
	
    public String getHolderName(){
        return holderName;
	}
	public void setHolderName(String holderName){
		this.holderName = holderName;
	}

    public int getBalancePoints(){
        return balancePoints;
	}
	public void setBalancePoints(int balancePoints){
		this.balancePoints = balancePoints;
	}	
}













