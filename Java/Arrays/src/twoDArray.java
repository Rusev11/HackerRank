import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class twoDArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int currentSum = 0;
            for (int j = 0; j < arr[i].length - 2; j++) {
                currentSum =
                        arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                                    arr[i + 1][j + 1] +
                        arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                sums.add(currentSum);
            }
        }
        return Collections.max(sums);
    }


    public static void main(String[] args) {
        int[][] arr =
                {
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0},
                };
        System.out.println(hourglassSum(arr));
    }
}