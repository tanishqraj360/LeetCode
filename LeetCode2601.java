public class LeetCode2601 {
  public boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public boolean primeSubOperation(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int bound;

      if (i == 0) {
        bound = nums[0];
      } else {
        bound = nums[i] - nums[i - 1];
      }

      if (bound <= 0) {
        return false;
      }

      int largestPrime = 0;
      for (int j = bound - 1; j >= 2; j--) {
        if (isPrime(j)) {
          largestPrime = j;
          break;
        }
      }

      nums[i] -= largestPrime;
    }
    return true;
  }
}
