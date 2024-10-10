public class LeetCode921 {
  public int minAddToMakeValid(String s) {
    int openBracket = 0;
    int minAddsRequired = 0;

    for (char c : s.toCharArray()) {
      if (c == '(') {
        openBracket++;
      } else {
        if (openBracket > 0) {
          openBracket--;
        } else {
          minAddsRequired++;
        }
      }
    }
    return minAddsRequired + openBracket;
  }
}
