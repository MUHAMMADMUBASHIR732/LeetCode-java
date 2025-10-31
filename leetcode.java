// import java.util.HashMap;

// public class leetcode {

//     /*
//      * Given an array of integers nums and an integer target, return indices of the
//      * two numbers such that they add up to target.
//      * 
//      * You may assume that each input would have exactly one solution, and you may
//      * not use the same element twice.
//      * 
//      * You can return the answer in any order.
//      * 
//      * 
//      * 
//      * Example 1:
//      * 
//      * Input: nums = [2,7,11,15], target = 9
//      * Output: [0,1]
//      * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//      */

//     public static int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return new int[] {};
//     }

//     /*
//      * ================= Q2 ======================
//      * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
//      * and M.
//      * 
//      * Symbol Value
//      * I 1
//      * V 5
//      * X 10
//      * L 50
//      * C 100
//      * D 500
//      * M 1000
//      * For example, 2 is written as II in Roman numeral, just two ones added
//      * together. 12 is written as XII, which is simply X + II. The number 27 is
//      * written as XXVII, which is XX + V + II.
//      * 
//      * Roman numerals are usually written largest to smallest from left to right.
//      * However, the numeral for four is not IIII. Instead, the number four is
//      * written as IV. Because the one is before the five we subtract it making four.
//      * The same principle applies to the number nine, which is written as IX. There
//      * are six instances where subtraction is used:
//      * 
//      * I can be placed before V (5) and X (10) to make 4 and 9.
//      * X can be placed before L (50) and C (100) to make 40 and 90.
//      * C can be placed before D (500) and M (1000) to make 400 and 900.
//      * Given a roman numeral, convert it to an integer.
//      * 
//      * 
//      */
//     public static int romanToInt(String s) {
//         HashMap<Character, Integer> romanMap = new HashMap<>();
//         romanMap.put('I', 1);
//         romanMap.put('V', 5);
//         romanMap.put('X', 10);
//         romanMap.put('L', 50);
//         romanMap.put('C', 100);
//         romanMap.put('D', 500);
//         romanMap.put('M', 1000);

//         int total = 0;

//         for (int i = 0; i < s.length(); i++) {
//             int value = romanMap.get(s.charAt(i));
//             if (i + 1 < s.length()) {

//                 int value2 = romanMap.get(s.charAt(i + 1));
//                 if (value < value2) {
//                     total += (value2 - value);
//                     i++;
//                     continue;
//                 }

//                 total += value;
//             }

//         }

//         return total;
//     }

//     /*
//      * Given a string s consisting of words and spaces, return the length of the
//      * last word in the string.
//      * 
//      * A word is a maximal substring consisting of non-space characters only.
//      * 
//      * 
//      * 
//      * Example 1:
//      * 
//      * Input: s = "Hello World"
//      * Output: 5
//      * Explanation: The last word is "World" with length 5.
//      */

//     public static int lengthOfLastWord(String s) {
//         String[] str = s.split(" ");
//         int l = str.length;
//         return str[l - 1].length();
//     }

//     /*
//      * ================Jump Game =======================
//      * You are given an integer array nums. You are initially positioned at the
//      * array's first index, and each element in the array represents your maximum
//      * jump length at that position.
//      * 
//      * Return true if you can reach the last index, or false otherwise.
//      * 
//      * 
//      * 
//      * Example 1:
//      * 
//      * Input: nums = [2,3,1,1,4]
//      * Output: true
//      * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
//      */

//     public static boolean canJump(int[] nums) {
//         int gas = 0;
//         for (int n : nums) {
//             if (gas < 0) {
//                 return false;
//             }
//             if (n > gas) {
//                 gas = n;
//             }
//             gas--;
//         }
//         return true;
//     }

//     /*
//      * ==================Jump Game 2 ==========================
//      * You are given a 0-indexed array of integers nums of length n. You are
//      * initially positioned at nums[0].
//      * 
//      * Each element nums[i] represents the maximum length of a forward jump from
//      * index i. In other words, if you are at nums[i], you can jump to any nums[i +
//      * j] where:
//      * 
//      * 0 <= j <= nums[i] and
//      * i + j < n
//      * Return the minimum number of jumps to reach nums[n - 1]. The test cases are
//      * generated such that you can reach nums[n - 1].
//      * 
//      * 
//      * 
//      * Example 1:
//      * 
//      * Input: nums = [2,3,1,1,4]
//      * Output: 2
//      * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1
//      * step from index 0 to 1, then 3 steps to the last index.
//      */

//      public static int jump(int[] nums) {
//         int jump = 0;
//         int wanted = 0;
//         for (int i : nums) {
//             if (i  == nums.length -1 ) {
//                 wanted = nums[i];
//                 break;
//             }
//         }
        
//         return jump;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2,3,1,1,4};
//         System.out.println(jump(nums));        
//     }

// }

public class leetcode {
   
}