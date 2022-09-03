public class CustomerDetails implements BonusPoints, DoorDelivery{
    private String customerName;
    private String phoneNumber;
    private String streetName;
    private double billAmount;
    private int distance;
    
    public CustomerDetails(String customerName, String phoneNumber,
    String streetName, double billAmount, int distance){
        setCustomerName(customerName);
        setPhoneNumber(phoneNumber);
        setStreetName(streetName);
        setBillAmount(billAmount);
        setDistance(distance);
    }
    	
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getStreetName(){
        return streetName;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    
    public double getBillAmount(){
        return billAmount;
    }
    public void setBillAmount(double billAmount){
        this.billAmount = billAmount;
    }
    
    public int getDistance(){
        return distance;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }

    
    public double calculateBonusPoints(){
        if(billAmount>=250){
            double bonus = billAmount/10;
            return bonus;
        }
        return 0;
    }
    
    public double deliveryCharge(){
        double delivery_Charge_km=0;
        if(distance>=25)
            delivery_Charge_km = 8;
        else if(distance>=15 && distance<25)
            delivery_Charge_km = 5;
        else if(distance<15)
            delivery_Charge_km = 2;
            
        double delivery_charge_amount = distance*delivery_Charge_km;
        return delivery_charge_amount;
    }
}
