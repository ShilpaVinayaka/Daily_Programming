public class MissingNum_7 {

    public static void missingNum(int arr[]) {
        int n = arr.length+1;
        int sum = (n*(n+1))/2;

        for(int i=0; i<arr.length; i++) {
            sum -= arr[i];            
        }
        System.out.println("Missing Num="+sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8};
        missingNum(arr);
    }
}
