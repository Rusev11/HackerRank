import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class minimumSwap {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int spareNumber = 0;
        int swaps = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != i + 1) {
                for (int j = i+1; j < arr.length; j++) {
                    if (i+1 == arr[j]) {
                        spareNumber = arr[i];
                        arr[i] = arr[j];
                        arr[j] = spareNumber;
                        swaps++;
                        break;
                    }
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};
        System.out.println(minimumSwaps(arr));
    }


}
