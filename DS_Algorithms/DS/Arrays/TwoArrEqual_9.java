import java.util.HashMap;

public class TwoArrEqual_9 {
    //Approach- Using unordered map
    public static boolean twoArrHashmap_Appr(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        if (m!=n)
            return false;
        
        HashMap<Integer, Integer> unmap = new HashMap<>();
        
        // 1->1 2->2 3->1 4->1 0->1    (key->value) where value is the count of occurance of key
        for(int i:arr1)
            unmap.put(i, unmap.getOrDefault(i, 0)+1);

        for(int i:arr2) {
            if(unmap.containsKey(i)) {
                unmap.put(i, unmap.get(i)-1);  //Updating
                //If the count of the key is 0 then remove it from map
                if(unmap.get(i) == 0)           
                    unmap.remove(i);
            }
        }

        if(unmap.size() == 0)
            return true;
        
        return false;
        
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,4,2,0,3};
        int arr2[] = {4,3,2,2,1,0};

        System.out.println("Two arrays are equal: " + twoArrHashmap_Appr(arr1, arr2));

    }
}
