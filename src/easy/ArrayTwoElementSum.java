package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ajay-dewari
 * @since 20 Jun 2021
 * <p>
 * Two Sum @see <a href="https://leetcode.com/problems/two-sum/">
 *
 * <p>
 * Given an array of integers nums and an integer target, return indices
 * of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class ArrayTwoElementSum {

    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        int[] sumArray = twoSum(array, 6);
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }

    //iterative approach with n2 worst case complexity
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    //iterative approach with n complexity
    //find two products in array with given sum problem solved with iterative approach with n worst complexity
    public static int[] pairSum(int[] nums, int target) {
        Set<Integer> set = new HashSet(Arrays.asList(nums));
        int[] arr = new int[2];
        for (int n : nums) {
            if (set.contains(target - n)) {
                arr[0] = n;
                arr[1] = target - n;
            } else {
                set.add(n);
            }
        }
        return arr;
    }
}