import java.io.*;
import java.util.*;

public class MarkAndToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        List<Integer> priceList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            priceList.add(prices[i]);
        }
        Collections.sort(priceList);
        int i = 0;
        while (sum <= k) {
            sum += priceList.get(i);
            i++;
        }
        return i-1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] input1line = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input1line[0]);
        int money = Integer.parseInt(input1line[1]);
        int[] toys = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int result = maximumToys(toys, money);
        System.out.println(result);
    }
}
