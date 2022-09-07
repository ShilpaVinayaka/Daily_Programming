public abstract class Endowment {
    private String endowmentId; 
    private String holderName; 
    private String endowmentType; 
    private String registrationDate;
    
    public Endowment(String endowmentId, String holderName, 
    String endowmentType, String registrationDate) {
        setEndowmentid(endowmentId); 
        setHolderName (holderName); 
        setEndowmentType (endowmentType); 
        setRegistrationDate(registrationDate);
    }
    public String getEndowmentId(){
        return endowmentid; } 
    public void setEndowmentId(String endowmentid) { 
        this.endowmentId = endowmentId; }
        
    public String getHolderName() {
        return holderName; } 
    public void setHolderName(String holderName) {
        this.holderName = holderName; }
    
    public String getEndowmentType() {
        return endowmentType; } 
    public void setEndowmentType(String endowmentType) {
        this.endowmentType = endowment Type; }
    
    public string getRegistrationDate(){
        return registrationDate; } 
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate; }
    
    public abstract double calculateEndowment();
}
