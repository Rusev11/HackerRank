import java.util.Arrays;
import java.util.Collections;

public class arrayManipulation {
    static long arrayManipulation(int n, long[][] queries) {
        long max = 0;
        long sum = 0;
        long[] array = new long[n + 1];
        for (int i = 0; i < queries.length; i++) {
            int startIndex = (int) queries[i][0];
            int endIndex = (int) queries[i][1]+1;
            if(endIndex == array.length){
                endIndex--;
            }
            int value = (int) queries[i][2];
            array[startIndex] += value;
            array[endIndex] -= value;
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        2 6 8
//        3 5 7
//        1 8 1
//        5 9 15
//        int n = 10;
//        long[][] arr =
//                {
//                        {2, 6, 8},
//                        {3, 5, 7},
//                        {1, 8, 1},
//                        {5, 9, 15}
//                };
        int n = 3;
        long[][] arr =
                {
                        {2, 3, 603},
                        {1, 1, 286},
                        {4, 4, 882}
                };
//        int n = 5;
//        long[][] arr =
//                {
//                        {1, 2, 100},
//                        {2, 5, 100},
//                        {6, 9, 1}
//                };
        System.out.println(arrayManipulation(10, arr));
    }
}
