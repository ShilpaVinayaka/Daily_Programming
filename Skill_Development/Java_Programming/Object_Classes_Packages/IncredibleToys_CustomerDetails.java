import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerDetails {
    private String customerId;
    private String customerName;
    private long phoneNumber;
    private String emailId;
    private String toyType;
    private double price;
    
    public boolean validateCustomerId(){
        Pattern pattern = Pattern.compile("Incredible/[0-9]{3}/[0-9]{4}");
        Matcher matcher = pattern.matcher(customerId);
        boolean matchValidate = matcher.find();
        if(matchValidate)
            return true;
        else 
            return false;
    }
    
    public double calculateDiscount(){
        double discount=0.0;
        if(toyType.equalsIgnoreCase("softtoys"))
            discount = 5;
        else if(toyType.equalsIgnoreCase("fidgettoys"))
            discount = 10;
        else if(toyType.equalsIgnoreCase("sensorytoys"))
            discount=15;
        else if(toyType.equalsIgnoreCase("puzzles"))
            discount=20;
        else
            discount=0;
            
        double amount = price - ((price*discount)/100);
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
    
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    
    public String getToyType(){
        return toyType;
    }
    public void setToyType(String toyType){
        this.toyType = toyType;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public CustomerDetails(String customerId, String customerName, 
    long phoneNumber, String emailId, String toyType, double price) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.toyType = toyType;
        this.price = price;
    }
    
    
}
