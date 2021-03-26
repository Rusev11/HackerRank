import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class leftRotation {
    static int[] rotLeft(int[] a, int d) {
        int[] b = new int[a.length];
        int loopsNumber = d % a.length;
        int index = 0;
        for (int i = loopsNumber; i < a.length; i++, index++) {
            b[index] = a[i];
        }
        for (int i = 0; i < loopsNumber; i++, index++) {
            b[index] = a[i];
        }
        return b;
    }


    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int d = 3;
        int[] result = rotLeft(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
