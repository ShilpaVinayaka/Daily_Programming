public class WoodenBero extends Bero{
    private String woodType;
    
    public WoodenBero(String beroType, String beroColour, String woodType){
        super(beroType,beroColour);
        setWoodType(woodType);
    }
    
    public String getWoodType(){
        return woodType;
    }
    public void setWoodType(String woodType){
        this.woodType = woodType;
    }
    
    public void calculatePrice(){
        double price = 0;
        if(woodType.equalsIgnoreCase("Ply Wood"))
            price = 15000;
        else if(woodType.equalsIgnoreCase("Teak Wood"))
            price = 12000;
        else if(woodType.equalsIgnoreCase("Engineered Wood"))
            price = 10000;
            
        setPrice(price);
    }
}
