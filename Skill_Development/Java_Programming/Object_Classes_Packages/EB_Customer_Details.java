public class CustomerDetails{
    private String customerId;
    private String customerName;
    private long phoneNumber;
    private String city;
    private double unitsConsumed;
    private double costPerUnit;
    
    public double calculateElectricityBill(){
       double amount = unitsConsumed * costPerUnit;
       return amount;
    }
    
    public String getCustomerId(){
        return customerId;
	}
	public void setCustomerId(String customerId){
		this.customerId = customerId;
	}
	
	public String getCustomerName(){
        return customerName;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	
    public long getPhoneNumber(){
        return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
    public String getCity(){
        return city;
	}
	public void setCity(String city){
		this.city = city;
	}
    
    public double getUnitsConsumed(){
        return unitsConsumed;
	}
	public void setUnitsConsumed(double unitsConsumed){
		this.unitsConsumed = unitsConsumed;
	}
   
    public double getCostPerUnit(){
        return costPerUnit;
	}
	public void setCostPerUnit(double costPerUnit){
		this.costPerUnit = costPerUnit;
	}
	
	public CustomerDetails(String customerId, String customerName, long phoneNumber,
     String city, double unitsConsumed, double costPerUnit)
     {
         this.customerId = customerId;
         this.customerName = customerName;
         this.phoneNumber = phoneNumber;
         this.city = city;
         this.unitsConsumed = unitsConsumed;
         this.costPerUnit = costPerUnit;
     }
    
}













