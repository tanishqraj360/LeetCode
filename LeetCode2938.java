public class LeetCode2938 {
  public long minimumSteps(String s) {
    long totalSwaps = 0;
    int whitePosition = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        totalSwaps += i - whitePosition;

        whitePosition++;
      }
    }

    return totalSwaps;
  }
}
