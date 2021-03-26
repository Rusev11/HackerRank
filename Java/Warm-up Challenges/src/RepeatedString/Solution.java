package RepeatedString;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numberInString = 0;
        long numberInNStrings = 0;
        long numberInRestString = 0;
        long restStringLength = n % s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                numberInString += 1;
            }
        }
        long stringRepeat = n / s.length();
        numberInNStrings = numberInString * stringRepeat;
        for (int i = 0; i < restStringLength; i++) {
            if (s.charAt(i) == 'a') {
                numberInRestString += 1;
            }
        }

        return numberInNStrings + numberInRestString;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("bcbccacaacbbacabcabccacbccbababbbbabcccbbcbcaccababccbcbcaabbbaabbcaabbbbbbabcbcbbcaccbccaabacbbacbc", 649606239668L));
    }
}
