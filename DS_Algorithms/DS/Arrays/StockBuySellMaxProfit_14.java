import java.util.*;
public class StockBuySellMaxProfit_14 {
    public static int stockbuySell_valleyPeakAppr(int arr[]) {
        int maxProfit = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                maxProfit += arr[i] - arr[i-1];
            }
        }

        return maxProfit;
     }
     
     ArrayList<ArrayList<Integer> > stockBuySell(int arr[]) {
        ArrayList<ArrayList<Integer> > maxProfit = new ArrayList<ArrayList<Integer> >();
        int r=0;        
        for(int i=1; i<arr.length; i++) 
        {
            if(arr[i] > arr[i-1]) {
                // One space allocated for R0
                maxProfit.add(new ArrayList<Integer>());            
                maxProfit.get(r).add(0, i-1);
                maxProfit.get(r).add(1, i);
                r++;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println("Maximum Profit: " + stockbuySell_valleyPeakAppr(price));
        
    }
}
