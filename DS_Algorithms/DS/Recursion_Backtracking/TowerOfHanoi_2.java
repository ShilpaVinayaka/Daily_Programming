package Recursion_Backtracking;

public class TowerOfHanoi_2 {

    public static void towerOfHanoi(int n, char src, char helper, char dest) {

        if(n==1) {
            System.out.println("Transfer from " + n + " from "+ src +" to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer from " + n + " from "+ src +" to " + dest);

        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'S', 'T', 'D');
    }
}
 