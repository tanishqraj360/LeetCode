import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class LeetCode2463a {
  public long minimumTotalDistance(List<Integer> robot, int[][] factories) {
    Collections.sort(robot);
    Arrays.sort(factories, (a, b) -> a[0] - b[0]);
    List<Integer> factoryPos = new ArrayList<>();
    for (int[] factory : factories) {
      for (int i = 0; i < factory[1]; i++)
        factoryPos.add(factory[0]);
    }

    int m = robot.size(), n = factoryPos.size();
    long[][] dp = new long[m + 1][n + 1];
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0)
          dp[i][j] = 0L;
        else if (j == 0)
          dp[i][j] = Long.MAX_VALUE;
        else if (i > j)
          dp[i][j] = Long.MAX_VALUE;
        else {
          dp[i][j] = Math.min(dp[i][j - 1],
              dp[i - 1][j - 1] + (long) Math.abs(robot.get(i - 1) - factoryPos.get(j - 1)));
        }
      }
    }

    return dp[m][n];
  }
}
