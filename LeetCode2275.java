public class LeetCode2275 {
  public int largestCombination(int[] candidates) {
    int[] bitCount = new int[24];
    for (int i = 0; i < 24; i++) {
      for (int candidate : candidates) {
        if ((candidate & (1 << i)) != 0) {
          bitCount[i]++;
        }
      }
    }
    int max = 0;
    for (int count : bitCount) {
      if (count > max) {
        max = count;
      }
    }
    return max;
  }
}
