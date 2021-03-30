import java.util.Arrays;
import java.util.Collections;

public class arrayManipulation {
    static long arrayManipulation(int n, long[][] queries) {
        long[] arr = new long[n];
        for (int i = 0; i < queries.length; i++) {
            int start = (int) queries[i][0] - 1;
            int end = (int) queries[i][1] - 1;
            long value = queries[i][2];
            for (int j = start; j <= end; j++) {
                arr[j] += value;
            }
        }
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 5;
        long[][] arr =
                {
                        {1, 2, 100},
                        {2, 5, 100},
                        {6, 9, 1}
                };
        System.out.println(arrayManipulation(10, arr));
    }
}
