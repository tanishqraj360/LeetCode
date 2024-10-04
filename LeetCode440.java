public class LeetCode440 {

  public int count(int cur, int n) {
    long res = 0;
    long first = cur, next = cur + 1;
    while (first <= n) {
      res += Math.min(next, n + 1) - first;
      first *= 10;
      next *= 10;
    }
    return (int) res;
  }

  public int findKthNumber(int n, int k) {
    int cur = 1;
    int i = 1;
    while (i < k) {
      int steps = count(cur, n);
      if (i + steps <= k) {
        cur++;
        i += steps;
      } else {
        cur *= 10;
        i++;
      }
    }
    return cur;
  }
}
