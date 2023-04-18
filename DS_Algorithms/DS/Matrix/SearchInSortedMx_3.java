package Matrix;

public class SearchInSortedMx_3 {

    public static void searchMx(int arr[][], int k) {
        int i = 0, j = arr[0].length - 1;

        while(i<arr.length && j>=0) {

            if(arr[i][j] == k) {
                System.out.println("Found at "+i+"-"+j);
                return;
            }
            if(arr[i][j]>k)
                j--;
            else
                i++;
        }

        System.out.println("Ele not found");
        return;


    }
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 } };

        searchMx(mat, 50);
    
    }
}
