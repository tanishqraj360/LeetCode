import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode2530 {
  public long maxKelements(int[] nums, int k) {
    long ans = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for (int i : nums) {
      pq.add(i);
    }

    while (k > 0) {
      int maxElements = pq.poll();
      ans += maxElements;
      pq.add((int) Math.ceil(maxElements / 3.0));
      k--;
    }

    return ans;
  }
}
