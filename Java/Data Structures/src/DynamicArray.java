import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        ArrayList<Integer>[] arr = new ArrayList[n];
        List<Integer> results = new ArrayList<>();
        int lastAnswer = 0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < queries.size(); i++) {
            int queryType = queries.get(i).get(0);
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            int idx = (x ^ lastAnswer) % n;
            if (queryType == 1) {
                arr[idx].add(y);
            } else {
                int size = arr[idx].size();
                lastAnswer = arr[idx].get(y % size);
                System.out.println(lastAnswer);
                results.add(lastAnswer);
            }

        }
        return results;
    }

    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();
        int n = 2;

        Integer[] currentQuery0 = {1, 0, 5};
        queries.add(Arrays.asList(currentQuery0));
        Integer[] currentQuery1 = {1, 1, 7};
        queries.add(Arrays.asList(currentQuery1));
        Integer[] currentQuery2 = {1, 0, 3};
        queries.add(Arrays.asList(currentQuery2));
        Integer[] currentQuery3 = {2, 1, 0};
        queries.add(Arrays.asList(currentQuery3));
        Integer[] currentQuery4 = {2, 1, 1};
        queries.add(Arrays.asList(currentQuery4));
        dynamicArray(n, queries);
    }
}
