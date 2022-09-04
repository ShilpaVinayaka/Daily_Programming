public class DayScholar extends Student
{
    private int bus Number; 
    private float distance;
    
    public DayScholar(int studentId, String studentName, String department, 
    String gender, String category, double college Fee, 
    int bus Number, float distance) {
        super (studentId, studentName, department, gender, 
        category, college Fee); 
        setBus Number(bus Number); 
        setDistance (distance);
    }
    
    public int getBus Number(){
        return bus Number;
    }
    public void setBus Number(int busNumber){
        this.busNumber = bus Number;
    }
    
    public float getDistance() {
        return distance; 
    }
    public void setDistance(float distance) {
        this.distance = distance;
    }
    
    public double calculateTotalFee() {
        double busFee = 0, amount; 
        if(distance>30 && distance<=40)
            busFee = 28000; 
        else if(distance>20 && distance<=30)
            busFee = 20000; 
        else if(distance>10 && distance<=20)
            busFee = 12000; 
        else if(distance<=10)
            busFee = 6000;
            
        amount = college Fee + busFee; 
        return amount;
    }
}
    
