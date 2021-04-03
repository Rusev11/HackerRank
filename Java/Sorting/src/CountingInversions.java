import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingInversions {

    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
        long swaps = 0;
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (currentNumber < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                } else {
                    break;
                }
            }
        }
        return swaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {2, 1, 3, 1, 2};
        long result = countInversions(array);
        System.out.println(result);
    }
}

