import java.util.*;

public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s) {
        int anagram = 0;
        List<String> possibleAnagrams = new LinkedList<>();
        Map<Character, Integer> charNumber = convertStringToMap(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subStr = s.substring(i, j + 1);
                if (subStr.length() < s.length()) {
                    possibleAnagrams.add(subStr);
                }
            }
        }
        for (int i = 0; i < possibleAnagrams.size() - 1; i++) {
            for (int j = i + 1; j < possibleAnagrams.size(); j++) {
                String s1 = possibleAnagrams.get(i);
                String s2 = possibleAnagrams.get(j);
                if (s1.length() == s2.length()) {
                    if (isAnagram(s1, s2)) {
                        anagram++;
                    }
                }
            }
        }
        return anagram;

//        int total = 0;
//        for (int i = 1; i < s.length(); i++) {
//            int[] tmpStr = new int[26];
//            for (int j = i; j >= 0; j--) {
//                tmpStr[s.charAt(j) - 'a']++;
//                for (int k = 0; k < j; k++) {
//                    int[] chars = new int[26];
//                    int x = k;
//                    int count = 0;
//                    while (count <= i - j) {
//                        chars[s.charAt(x) - 'a']++;
//                        x++;
//                        count++;
//                    }
//                    boolean flag = true;
//                    for (x = 0; x < 26; x++) {
//                        if (tmpStr[x] != chars[x]) {
//                            flag = false;
//                            break;
//                        }
//                    }
//                    if (flag) {
//                        total++;
//                    }
//                }
//            }
//
//        }
//        return total;
    }

    static Map<Character, Integer> convertStringToMap(String s) {
        Map<Character, Integer> charNumber = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            Integer currentCharIndex = charNumber.get(currentChar);
            if (currentCharIndex == null) {
                charNumber.put(currentChar, 1);
                continue;
            }
            charNumber.put(currentChar, charNumber.get(currentChar) + 1);
        }
        return charNumber;
    }

    static boolean isAnagram(String s1, String s2) {
        int[] s1Char = convertStringToCharArray(s1);
        int[] s2Char = convertStringToCharArray(s2);
        boolean isAnagram = true;
        for (int i = 0; i < s1Char.length; i++) {
            if (s1Char[i] != s2Char[i]) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    static int[] convertStringToCharArray(String s) {
        int[] charArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = currentChar - 'a';
            charArray[index]++;
        }
        return charArray;
    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abba"));
//        System.out.println(sherlockAndAnagrams("abcd"));
//        System.out.println(sherlockAndAnagrams("ifailuhkqq"));
//        System.out.println(sherlockAndAnagrams("kkkk"));
    }
}
