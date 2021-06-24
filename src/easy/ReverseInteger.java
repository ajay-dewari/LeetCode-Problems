package easy;

/**
 * @author ajay-dewari
 * @since 24 Jun 2021
 * <p>
 * <p>
 * Reverse Integer @see <a href="https://leetcode.com/problems/reverse-integer/">
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Example 1:
 * Input: x = 123
 * Output: 321
 * <p>
 * <p>
 * Example 2:
 * Input: x = -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 * Example 4:
 * <p>
 * Input: x = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * -231 <= x <= 231 - 1
 */
public class ReverseInteger {

    public int reverse(int x) {
        long reverse = 0;
        while (0 != x) {
            int r = x % 10;
            reverse = (reverse * 10) + r;
            x = x / 10;
        }
        if (Integer.MAX_VALUE >= reverse && Integer.MIN_VALUE <= reverse) {
            return (int) reverse;
        } else {
            return 0;
        }

    }
}