import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LeetCode2501 {
  public int longestSquareStreak(int[] nums) {
    int max = -1;
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    List<Integer> setArr = new ArrayList<>(set);
    Collections.sort(setArr);

    for (int i = 0; i < setArr.size(); i++) {
      int curr = setArr.get(i);
      int count = 0;

      while (set.contains(curr)) {
        set.remove(curr);
        curr = curr * curr;
        count++;
      }
      max = Math.max(max, count);
    }

    return max > 1 ? max : -1;
  }
}
