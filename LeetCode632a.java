import java.util.List;
import java.util.PriorityQueue;
import java.util.List;

public class LeetCode632a {
  public int[] smallestRange(List<List<Integer>> nums) {
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
    int maxVal = Integer.MIN_VALUE;
    int n = nums.size();

    for (int i = 0; i < n; i++) {
      int val = nums.get(i).get(0);
      pq.offer(new int[] { val, i, 0 });
      maxVal = Math.max(maxVal, val);
    }

    int range = Integer.MAX_VALUE;
    int[] result = new int[2];

    while (true) {
      int[] minElement = pq.poll();
      int minVal = minElement[0], listIdx = minElement[1], elemIdx = minElement[2];

      if (maxVal - minVal < range) {
        range = maxVal - minVal;
        result[0] = minVal;
        result[1] = maxVal;
      }

      if (elemIdx + 1 == nums.get(listIdx).size()) {
        break;
      }

      int nextVal = nums.get(listIdx).get(elemIdx + 1);
      pq.offer(new int[] { nextVal, listIdx, elemIdx + 1 });
      maxVal = Math.max(maxVal, nextVal);
    }

    return result;
  }
}
