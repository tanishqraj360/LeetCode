import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCode884 {
  public String[] uncommonFromSentences(String s1, String s2) {
    Map<String, Integer> wordCount = new HashMap<>();

    for (String word : (s1 + " " + s2).split(" ")) {
      wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }

    List<String> result = new ArrayList<>();
    for (String word : wordCount.keySet()) {
      if (wordCount.get(word) == 1) {
        result.add(word);
      }
    }

    return result.toArray(new String[0]);
  }
}
