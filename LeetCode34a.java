public class LeetCode34a {
  public int[] searchRange(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
      if (nums[left] == target && nums[right] == target) {
        return new int[] { left, right };
      } else if (nums[left] == target) {
        right--;
      } else if (nums[right] == target) {
        left++;
      } else {
        left++;
        right--;
      }
    }
    return new int[] { -1, -1 };
  }
}
