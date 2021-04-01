import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int shiftsNumber = d % arr.size();
        List<Integer> shiftedArray = new ArrayList<>();
        for (int i = shiftsNumber; i<arr.size(); i++){
            shiftedArray.add(arr.get(i));
        }
        for (int i = 0; i < shiftsNumber ; i++) {
            shiftedArray.add(arr.get(i));
        }
        return shiftedArray;
    }

    public static void main(String[] args) {
        int d = 2;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(rotateLeft(d,arr));
    }
}
