import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCode229 {
  public List<Integer> majorityElement(int[] nums) {
    Map<Integer, Integer> elementCountMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      elementCountMap.put(nums[i], elementCountMap.getOrDefault(nums[i], 0) + 1);
    }

    List<Integer> majorityElement = new ArrayList<>();
    int threshold = nums.length / 3;

    for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
      int element = entry.getKey();
      int count = entry.getValue();

      if (count > threshold) {
        majorityElement.add(element);
      }
    }

    return majorityElement;
  }
}
