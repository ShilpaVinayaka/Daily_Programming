import java.util.HashMap;
import java.util.Map;
public class VehicleUtility {
 private Map<String, Double> vehicleMap = new HashMap<String, Double>();
 public Map<String, Double> getVehicleMap() {
 return vehicleMap;
 }
 public void setVehicleMap(Map<String, Double> vehicleMap) {
 this.vehicleMap = vehicleMap;
 }
 public void addVehiclePriceDetails(String vehicleName, double price) {
 vehicleMap.put(vehicleName, price);
 }
 public double calculateCostAfterDiscount(String vehicleName) {
 double discount=0, sellingPrice=0;
 for(Map.Entry<String,Double> set : vehicleMap.entrySet())
 {
 String t = set.getKey();
 if(vehicleName.equalsIgnoreCase(t)){
 
 String arr[] = t.split(" ",2);
 
 if(arr[0].equalsIgnoreCase("TVS"))
 discount = (set.getValue())*0.1;
 else if(arr[0].equalsIgnoreCase("Honda"))
 discount = (set.getValue())*0.05;
 else if(arr[0].equalsIgnoreCase("Yamaha"))
 discount = (set.getValue())*0.07;
 else
 discount = 0;
 
 sellingPrice = set.getValue()-discount;
 return sellingPrice;
 }
 
 }
 return sellingPrice;
 }
}
