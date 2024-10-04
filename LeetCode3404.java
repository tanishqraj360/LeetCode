import java.util.HashSet;

public class LeetCode3404 {
  public int longestCommonPrefix(int[] arr1, int[] arr2) {
    HashSet<Integer> arr1Prefix = new HashSet<Integer>();

    for (int val : arr1) {
      while (!arr1Prefix.contains(val) && val > 0) {
        arr1Prefix.add(val);

        val /= 10;
      }
    }

    int longestPrefix = 0;

    for (int val : arr2) {
      while (!arr1Prefix.contains(val) && val > 0) {
        val /= 10;
      }

      if (val > 0) {
        longestPrefix = Math.max(longestPrefix, (int) Math.log10(val) + 1);
      }
    }

    return longestPrefix;
  }
}
