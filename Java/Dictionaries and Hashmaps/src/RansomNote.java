import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> magazineList = new LinkedList<>(Arrays.asList(magazine));
        for (int i = 0; i < note.length; i++) {
            boolean currentWordFound = false;
            int indexOfCurrentWord = magazineList.indexOf(note[i]);
            if (indexOfCurrentWord ==-1) {
                System.out.println("No");
                return;
            }
            magazineList.remove(indexOfCurrentWord);
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
//        two times three is not four
//        two times two is four
        String[] magazine = {"two", "times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};
        checkMagazine(magazine, note);
    }
}
