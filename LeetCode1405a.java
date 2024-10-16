public class LeetCode1405a {
  public String longestDiverseString(int a, int b, int c) {
    StringBuilder ans = new StringBuilder();

    int totalLength = a + b + c;
    int continousA = 0, continousB = 0, continousC = 0;

    for (int i = 0; i < totalLength; i++) {
      if ((a >= b && a >= c && continousA != 2) || (continousB == 2 && a > 0) || (continousC == 2 && a > 0)) {
        ans.append("a");
        a--;
        continousA++;
        continousB = 0;
        continousC = 0;
      } else if ((b >= a && b >= c && continousB != 2) || (continousA == 2 && b > 0) || (continousC == 2 && b > 0)) {
        ans.append("b");
        b--;
        continousB++;
        continousA = 0;
        continousC = 0;
      } else if ((c >= a && c >= b && continousC != 2) || (continousB == 2 && c > 0) || (continousA == 2 && c > 0)) {
        ans.append("c");
        c--;
        continousC++;
        continousA = 0;
        continousB = 0;
      }
    }

    return ans.toString();
  }
}
