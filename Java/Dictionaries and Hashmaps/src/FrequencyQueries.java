import java.util.*;

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> result = new HashMap<>();
        Iterator<List<Integer>> iterator = queries.iterator();
        List<Integer> typeThreeQueries = new ArrayList<>();
        while (iterator.hasNext()) {
            List<Integer> currentQueriesList = iterator.next();
            int currentNumber = currentQueriesList.get(1);
            Integer currentNumberCounts = result.get(currentNumber);

            if (currentQueriesList.get(0) == 1) {
                if (currentNumberCounts == null) {
                    result.put(currentNumber, 1);
                } else {
                    result.put(currentNumber, currentNumberCounts + 1);
                }
                continue;
            }

            if (currentQueriesList.get(0) == 2) {
                if (currentNumberCounts == null) {
                    continue;
                } else if (currentNumberCounts == 1) {
                    result.remove(currentNumber);
                    continue;
                } else {
                    result.put(currentNumber, currentNumberCounts - 1);
                }
            }

            if (currentQueriesList.get(0) == 3) {
                boolean flag = false;
                for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                    if (entry.getValue()  == currentNumber) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    typeThreeQueries.add(1);
                } else {
                    typeThreeQueries.add(0);
                }
            }
        }
        return typeThreeQueries;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            List<Integer> queriesRowItems = new ArrayList<>();
            String[] singleQueryLine = scanner.nextLine().split(" ");
            queriesRowItems.add(Integer.parseInt(singleQueryLine[0]));
            queriesRowItems.add(Integer.parseInt(singleQueryLine[1]));
            queries.add(queriesRowItems);
        }

        List<Integer> ans = freqQuery(queries);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
