public class Discount{
    
    public double calculateDiscount(Bero bObj){
        double discount = 0;
        if(bObj instanceof SteelBero){
            discount = (bObj.getPrice())*0.1;
        }
        else if(bObj instanceof WoodenBero){
            discount = (bObj.getPrice())*0.15;
        }
        return discount;
            
    }
}
