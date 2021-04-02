import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class BubbleSort {
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int swapCount = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j+1);
                    swapCount++;
                }
            }
        }
//        Array is sorted in 3 swaps.
//                First Element: 1
//        Last Element: 3
        System.out.printf("Array is sorted in %d swaps.\n",swapCount);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);

    }

    private static void swap(int[] array, int a, int b) {
        int spareNum = array[a];
        array[a] = array[b];
        array[b] = spareNum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

    }
}
