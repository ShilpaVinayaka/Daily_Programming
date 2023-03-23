import java.util.*;

public class MinimumPlatforms_13 {

    public static int minimum_Platforms_sort(int arr[], int dept[]) {
        Arrays.sort(arr);
        Arrays.sort(dept);

        int i = 1, j = 0, max_plat = 1, needed_plat = 1;

        while (i < arr.length && j < dept.length) {
            if (arr[i] <= dept[j]) {
                i++;
                max_plat++; // Arriving - Increase platforms required
            } else if (arr[i] > dept[j]) {
                j++;
                max_plat--; // Departing
            }

            if (max_plat > needed_plat)
                needed_plat = max_plat;
        }
        return needed_plat;
    }

    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println("Max Platforms required = " + minimum_Platforms_sort(arr, dep));
    }
}
