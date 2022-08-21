package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Permutations {

    public static void main(String[] args) {
        System.out.println(isPermutation("foo", "ofo"));
        System.out.println(isPermutation("fooz", "cofo"));
        System.out.println(isPermutationOptimized("foo", "ofo"));
        System.out.println(isPermutationOptimized("fooz", "cofo"));
    }

    static boolean isPermutation(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }

        char[] leftChars = left.toCharArray();
        char[] rightChars = right.toCharArray();
        Arrays.sort(leftChars);
        Arrays.sort(rightChars);
        return Arrays.equals(leftChars, rightChars);
    }

    static boolean isPermutationOptimized(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        Map<Character, Integer> characterCount = new HashMap();
        for(char c: left.toCharArray()){
            characterCount.putIfAbsent(c, 0);
            characterCount.put(c, characterCount.get(c) + 1);
        }
        for(char c: right.toCharArray()){
            if(!characterCount.containsKey(c)) return false;
            characterCount.put(c, characterCount.get(c) - 1);
        }
        for(int v: characterCount.values()) {
            if(v != 0) return false;
        }
        return true;
    }
}

