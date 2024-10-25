import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1233 {
  public List<String> removeSubfolders(String[] folder) {
    Arrays.sort(folder);

    List<String> result = new ArrayList<>();
    result.add(folder[0]);

    for (int i = 1; i < folder.length; i++) {
      String lastFolder = result.get(result.size() - 1);
      lastFolder += '/';

      if (!folder[i].startsWith(lastFolder)) {
        result.add(folder[i]);
      }
    }

    return result;
  }
}
