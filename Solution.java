import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static int mySqrt(int x) {
        // int final2 = 1;
        // if(x ==0){
        // return 0;
        // }
        // for(int i = 1; i < x; i++){
        // if(((i*i)==x) || (((i+1)*(i+1)>x) && ((i*i)<x)) ){
        // final2 = (int)i;
        // }
        // }
        // return final2;

        if (x < 2)
            return x; // covers 0 and 1

        int i = 1;
        while (i <= x / i) { // avoid overflow by comparing with x / i instead of i*i
            if (i * i == x) {
                return i;
            }
            i++;
        }
        return i - 1; // floor of sqrt

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m; // track how many elements are valid in nums1

        for (int i = 0; i < n; i++) {
            int insertIndex = 0;
            // Find the correct position to insert nums2[i]
            while (insertIndex < total && nums1[insertIndex] <= nums2[i]) {
                insertIndex++;
            }

            // Shift elements to the right
            for (int j = m + i; j > insertIndex; j--) {
                nums1[j] = nums1[j - 1];
            }

            // Insert the element
            nums1[insertIndex] = nums2[i];
            total++;
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();

        HashMap<Character, String> mapOfChar = new HashMap<Character, String>();
        mapOfChar.put('2', "abc");
        mapOfChar.put('3', "def");
        mapOfChar.put('4', "ghi");
        mapOfChar.put('5', "jkl");
        mapOfChar.put('6', "mno");
        mapOfChar.put('7', "pqrs");
        mapOfChar.put('8', "tuv");
        mapOfChar.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        result.add(""); // start with an empty string

        for (Character digit : digits.toCharArray()) {
            String letters = mapOfChar.get(digit);

            List<String> temp = new ArrayList<>();

            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    temp.add(combination + letter);
                }
            }
            result = temp;
        }

        return result;
    }

    public static String mergeAlternately(String word1, String word2) {
        String result = "";

        int n = word1.length()>word2.length()?word1.length():word2.length();
        for (int i = 0; i < n; i++) {

            if (i > word1.length() ){
                result += word2.substring(i);
            }
            else if (i > word2.length()){
                result += word1.substring(i);
            }
            result += word1.charAt(i) + word2.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
}
