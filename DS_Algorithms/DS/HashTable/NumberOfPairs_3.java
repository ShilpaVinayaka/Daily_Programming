package HashTable;

public class NumberOfPairs_3 {

    public static long pairs_simpleappr(int X[], int Y[]) {

        long count = 0;
        for (int i = 0; i < Y.length; i++) {
            for (int j = 0; j < Y.length; j++) {
                if(Math.pow(X[i], Y[j]) > Math.pow(Y[j], X[i])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int X[] = { 2, 1, 6 };
        int Y[] = { 1, 5 };

        System.out.println(pairs_simpleappr(X, Y));
    }
}
