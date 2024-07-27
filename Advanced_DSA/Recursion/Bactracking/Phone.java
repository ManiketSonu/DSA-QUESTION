package Advanced_DSA.Recursion.Bactracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    public static void main(String[] args) {
        Phone solution = new Phone();
        
        // Example 1
        String[] result1 = solution.letterCombinations("23");
        System.out.println("Output 1: " + Arrays.toString(result1));

    }
    private static final Map<Character, String> digitToLetters = new HashMap<>();
    static {
        digitToLetters.put('0', "0");
        digitToLetters.put('1', "1");
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");
    }
    public String[] letterCombinations(String A) {
        if (A == null || A.length() == 0) {
            return new String[0];
        }

        List<String> result = new ArrayList<>();
        generateCombinations(A, 0, "", result);
        return result.toArray(new String[0]);
    }
    private void generateCombinations(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);

        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1, current + letters.charAt(i), result);
        }
    }
}
