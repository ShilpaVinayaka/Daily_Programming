package Search_Sort;

public class MedianOfTwoSortedArr_8 {

    public static double medianofTwoArr(int arr1[], int arr2[]) {
        int i=0, j=0, m1=-1, m2=-1;

        for (int count = 0; count <= arr2.length; count++) 
        {
            if(i==arr1.length) {
                m1 = m2;
                m2 = arr2[0];
                break;
            } else if(j==arr1.length){
                m1 = m2;
                m2 = arr1[0];
                break;
            }

            if (arr1[i] <= arr2[j]) {
                m1 = m2;
                m2 = arr1[i++];

            } else {
                m1 = m2;
                m2 = arr2[j++];
            }
        }

        return (m1+m2)/2;

    }

    public static void main(String[] args) {
        int ar1[] = {1, 12, 15, 26, 38};
        int ar2[] = {2, 13, 17, 30, 45};

        System.out.println("Median = " + medianofTwoArr(ar1, ar2));
    
    }
}
