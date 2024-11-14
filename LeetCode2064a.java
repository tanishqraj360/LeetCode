class LeetCode2064a {
  public int minimizedMaximum(int n, int[] quantities) {
    int left = 1, right = 100000;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      if (check(n, quantities, mid)) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  private boolean check(int n, int[] quantities, int val) {
    int total = 0;
    for (int quantity : quantities) {
      total += (quantity + val - 1) / val;
    }
    return total > n ? false : true;
  }
}
