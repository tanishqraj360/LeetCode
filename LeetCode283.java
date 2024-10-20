class LeetCode283 {
  public void moveZeroes(int[] nums) {
    int n = nums.length, i = 0;

    for (int j = 0; j < n; j++) {
      if (nums[j] != 0) {
        nums[i] = nums[j];
        i++;
      }
    }

    for (int j = i; j < n; j++) {
      nums[j] = 0;
    }
  }
}
