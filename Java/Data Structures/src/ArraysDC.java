import java.util.Arrays;

public class ArraysDC {
    static int[] reverseArray(int[] a) {
        int[] reversedArray = new int[a.length];
        for (int i = 0, j=a.length-1; i < a.length; i++, j--) {
            reversedArray[i]=a[j];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString( reverseArray(new int[]{1, 2, 3, 4})));
    }
}
