import java.util.Arrays;

public class SparseArrays {
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] reusultArray = new int[queries.length];
        int index = 0;
        for (String query: queries){
            int counts = 0;
            for (int i = 0; i < strings.length; i++) {
                if(query.equals(strings[i])){
                    counts++;
                }
            }
            reusultArray[index] +=counts;
            index++;
        }
        return reusultArray;
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "ab", "abc"};
        String[] queries = {"ab", "abc", "bc"};
        System.out.println(Arrays.toString(matchingStrings(strings, queries)));
    }
}
