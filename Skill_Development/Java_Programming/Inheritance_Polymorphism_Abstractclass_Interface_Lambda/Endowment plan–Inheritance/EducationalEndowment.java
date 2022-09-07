public class EducationalEndowment extends Endowment{
    private String educationalInstitution; 
    private String educationalDivision;
    
    public Educational Endowment(String endowmentId, String holderName, 
    String endowmentType, String registrationDate, 
    String educationalInstitution, String educationalDivision) {
    super (endowmentId, holderName, endowmentType, registrationDate); 
    setEducational Institution (educationalInstitution); 
    setEducationalDivision(educationaldivision);
    }
    
    public String getEducationalInstitution() {
        return educational Institution; 
    } 
    public void setEducationalInstitution(String educational Institution) {
        this.educationalInstitution = educationalInstitution; 
    }
    
    public String getEducationalDivision(){
        return educationalDivision; } 
    public void setEducationalDivision(String educationalDivision) {
        this.educationalDivision = educationalDivision; }
        
    public double calculateEndowment() {
        double endowment Amount = 0; 
        if(educationalDivision.equals Ignorecase ("School"))
            endowment Amount = 30000; 
        else if(educationalDivision.equalsIgnorecase ("Undergraduate"))
            endowment Amount = 60000; 
        else if(educationalDivision.equalsIgnorecase ("Postgraduate"))
            endowment Amount = 90000;
            
        return endowment Amount;
    }
}
