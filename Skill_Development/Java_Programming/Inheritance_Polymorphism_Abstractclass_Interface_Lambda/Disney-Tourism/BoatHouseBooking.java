public class BoatHouseBooking extends Booking{
    private int noOfDays;
    private String foodType;
    
    public BoatHouseBooking(String customerName, String cityName, 
    String phoneNumber, int noOfPeople, int noOfDays, String foodType){
        super(customerName, cityName, phoneNumber, noOfPeople);
        setNoOfDays(noOfDays);
        setFoodType(foodType);
    }
    
    public int getNoOfDays(){
        return noOfDays;
    }
    public void setNoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }
    
    public String getFoodType(){
        return foodType;
    }
    public void setFoodType(String foodType){
        this.foodType = foodType;
    }
    
    public double calculateTotalAmount(){
        double amount  = noOfPeople*800 + noOfDays*3000;
        if(foodType.equalsIgnoreCase("NonVeg"))
            amount += 500;
        else if(foodType.equalsIgnoreCase("Veg"))
            amount += 250;
        
        Double totalAmount = new Double(amount);
        
        return totalAmount;
    }
}
