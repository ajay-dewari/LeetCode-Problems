package easy;

/**
 * Search Insert Position @see <a href="https://leetcode.com/problems/search-insert-position/">
 * <p>
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the index
 * where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 * <p>
 * <p>
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * <p>
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * <p>
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * <p>
 * Example 4:
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * <p>
 * Example 5:
 * Input: nums = [1], target = 0
 * Output: 0
 *
 * @author ajaydewari
 * @since 25 Oct 2021
 */
public class SearchInsertPosition {


    public static void main(String args[]){

    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int index = 0;
        while(end >= start) {
            int mid = start + ((end-start)/2);
            if (nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
                index = start;
            } else {
                end = mid - 1;
                index = mid;
            }
        }
        return index;
    }
}