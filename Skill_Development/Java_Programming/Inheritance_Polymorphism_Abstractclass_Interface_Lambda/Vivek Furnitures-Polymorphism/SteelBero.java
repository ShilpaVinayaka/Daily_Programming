public class SteelBero extends Bero{
    private int beroHeight;
    
    public SteelBero(String beroType, String beroColour, int beroHeight){
        super(beroType,beroColour);
        setBeroHeight(beroHeight);
    }
    
    public int getBeroHeight(){
        return beroHeight;
    }
    public void setBeroHeight(int beroHeight){
        this.beroHeight = beroHeight;
    }
    
    public void calculatePrice(){
        double price = 0;
        if(beroHeight==3)
            price = 5000;
        else if(beroHeight==5)
            price = 8000;
        else if(beroHeight==7)
            price = 10000;
            
        setPrice(price);
    }
}
