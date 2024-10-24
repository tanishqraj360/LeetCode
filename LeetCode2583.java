import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.tree.TreeNode;

public class LeetCode2583 {
  public long kthLargestLevelSum(TreeNode root, int k) {
    PriorityQueue<Long> p = new PriorityQueue<>(Collections.reverseOrder());
    Queue<TreeNode> q = new LinkedList<>();

    q.add(root);
    while (!q.isEmpty()) {
      int size = q.size();
      long sum = 0;

      for (int i = 0; i < size; i++) {
        TreeNode poppedNode = q.remove();
        sum += poppedNode.val;
        if (poppedNode.left != null) {
          q.add(poppedNode.left);
        }
        if (poppedNode.right != null) {
          q.add(poppedNode.right);
        }
      }
      p.add(sum);
    }
    if (p.size() < k)
      return -1;
    for (int i = 0; i < k - 1; i++)
      p.remove();

    return p.peek();

  }
}
