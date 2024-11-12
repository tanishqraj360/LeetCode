class LeetCode3097a {
  public int minimumSubarrayLength(int[] nums, int k) {
    int n = nums.length;
    int start = 0;
    int end = 0;
    int cur = 0;
    int[] arr = new int[31];
    int res = n + 1;
    while (end < n) {
      cur = add(arr, nums[end], cur);
      while (start <= end && cur >= k) {
        res = Math.min(res, end - start + 1);
        cur = remove(arr, nums[start++], cur);
      }
      end += 1;
    }
    return res == n + 1 ? -1 : res;
  }

  public int remove(int[] arr, int val, int cur) {

    for (int i = 0; i < 31; i++) {
      if ((val ^ (1 << i)) < val) {
        arr[i] -= 1;
        if (arr[i] == 0) {
          cur -= (1 << i);
        }
      }
    }
    return cur;
  }

  public int add(int[] arr, int val, int cur) {
    for (int i = 0; i < 31; i++) {
      if ((val ^ (1 << i)) < val) {
        arr[i] += 1;
        if (arr[i] == 1) {
          cur += (1 << i);
        }
      }
    }
    return cur;
  }

}
