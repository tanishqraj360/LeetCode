public class LeetCode2406a {
  public int minGroups(int[][] intervals) {
    int[] count = new int[1000002];

    for (int i = 0; i < intervals.length; i++) {
      count[intervals[i][0]]++;
      count[intervals[i][1] + 1]--;
    }

    int max = 0;
    int currSum = 0;

    for (int i = 1; i < count.length; i++) {
      currSum += count[i];

      max = Math.max(currSum, max);
    }

    return max;
  }
}
