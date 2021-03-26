import java.util.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int totalBribes = 0;
        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (int i = 0; i < q.length; ++i) {
            if (q[i] == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q[i] == expectedSecond) {
                ++totalBribes;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q[i] == expectedThird) {
                totalBribes += 2;
                ++expectedThird;
            } else {
                System.out.println( "Too chaotic");
                return;
            }
        }

        System.out.println(totalBribes);
    }

    public static void main(String[] args) {
//
//            int[] q = {2, 1, 5, 3, 4};
//            minimumBribes(q);
//            int[] a = {2, 5, 1, 3, 4};
//            minimumBribes(a);
        int[] b = {1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(b);

    }


}
