import java.util.List;
import java.util.List;

class LeetCode118a {
  public List<Integer> generateRow(int row) {
    int ans = 1;
    List<Integer> ansRow = new ArrayList<>();
    ansRow.add(1);
    for (int col = 1; col < row; col++) {
      ans = ans * (row - col);
      ans = ans / col;
      ansRow.add(ans);
    }
    return ansRow;
  }

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 1; i < numRows + 1; i++) {
      ans.add(generateRow(i));
    }
    return ans;
  }
}
