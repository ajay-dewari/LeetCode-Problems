package medium;

/**
 * **Medium**
 *
 * @author ajay-dewari
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">
 * LengthOfLongestSubstring</a>
 * Longest Substring Without Repeating Characters
 * Given a string *s*, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Example 4:
 * Input: s = ""
 * Output: 0
 * <p>
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 * @since 20 Jun 2021
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.print("length Of Longest Non repeating character Substring = "
                + lengthOfLongestNonRepeatingSubstring("abcabcbb"));
    }

    /**
     * @param s type of {@link String} to find a substring with non repeating character,
     *          i.e all character should be unique in that substring
     * @return {@link int} length of the longest substring which have non repeating character
     */
    public static int lengthOfLongestNonRepeatingSubstring(String s) {
        int max = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!str.contains("" + c)) {
                str = str + c;
                max = Math.max(max, str.length());
            } else {
                str = str.substring(str.indexOf(c) + 1) + c;
                max = Math.max(str.length(), max);
            }
        }
        return max;
    }
}