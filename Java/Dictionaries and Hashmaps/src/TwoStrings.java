import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        Set<Integer> s1Set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Set.add((int) s1.charAt(i));

        }
        for (int i = 0; i < s2.length(); i++) {
            if(s1Set.contains((int) s2.charAt(i))){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s1 = "wouldyoulikefries";
        String s2 = "abcabcabcabcabcabc";
        System.out.println(twoStrings(s1, s2));
    }
}
