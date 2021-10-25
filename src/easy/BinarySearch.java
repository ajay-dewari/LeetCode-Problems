package easy;

/**
 * <p>
 * Two Sum @see <a href="https://leetcode.com/problems/binary-search/">
 *
 * <p>
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 * <p>
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -10^4 < nums[i], target < 10^4
 * All the integers in nums are unique.
 * nums is sorted in ascending order.
 * <p>
 *
 * @author ajay-dewari
 * @since 21 Oct 2021
 */


public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {-1, 0, 5};
        System.out.print(search(array, 3));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

/*
 * =============Test Case=========
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 * <p>
 * Example 3:
 * <p>
 * [-1,0,3,5,9,12]
 * 2
 * Output: -1
 * <p>
 * Example 4:
 * [2,5]
 * 5
 * Output: 1
 * <p>
 * Example 5:
 * [5]
 * 5
 * Output: 0
 * <p>
 * Example 6:
 * [-1,0,3,5,9,12]
 * 2
 * Output: -1
 * <p>
 * Example 7:
 * [-1,0,5]
 * 2
 * Output: -1
 */