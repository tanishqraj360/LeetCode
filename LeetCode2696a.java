import java.util.Stack;

class LeetCode2696a {
  public int minLength(String s) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      char currentChar = s.charAt(i);

      if (stack.isEmpty()) {
        stack.push(currentChar);
        continue;
      }

      if (currentChar == 'B' && stack.peek() == 'A') {
        stack.pop();
      }

      else if (currentChar == 'D' && stack.peek() == 'C') {
        stack.pop();
      }

      else {
        stack.push(currentChar);
      }
    }

    return stack.size();
  }
}
