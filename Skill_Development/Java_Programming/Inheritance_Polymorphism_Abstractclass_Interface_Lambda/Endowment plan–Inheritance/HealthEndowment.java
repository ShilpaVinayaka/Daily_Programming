public class HealthEndowment extends Endowment{
    private String healthcareCenter; 
    private int holderAge;
    
    public HealthEndowment(String endowmentId, String holderName, 
    String endowmentType, string registrationDate, String healthcareCenter, 
    int holderAge) {
        super (endowmentId, holderName, endowmentType, registrationDate); 
        setHealthcareCenter(healthCareCenter); 
        setHolderAge (holderAge);
    }
    
    public String getHealthcareCenter() {
        return healthcareCenter;
    }
    public void setHealthcareCenter(String healthcareCenter) {
        this.healthCareCenter = healthcareCenter; 
    }
    public int getHolderAge){
        return holderAge;
    }
    public void setHolderAge(int holderAge) {
        this.holderAge = holderAge; }
    
    public double calculateEndowment() {
        double endowment Amount = 0; 
        if(holderAge<=30)
        endowment Amount = 120000; 
        else if(holderAge>30 && holderAge<60)
        endowment Amount = 200000; 
        else if(holderAge >=60)
        endowment Amount = 500000;
        
        return endowment Amount;
    }
}
