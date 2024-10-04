public class LeetCode214 {
  public String shortestPalindrome(String s) {

    if (s.isEmpty()) {
      return "";
    }

    long prefix = 0;
    long suffix = 0;
    long base = 29;
    int lastIndex = 0;
    long power = 1;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int charValue = c - 'a' + 1;

      prefix = (prefix * base);
      prefix = (prefix + charValue);

      suffix = (suffix + charValue * power);
      power = (power * base);

      if (prefix == suffix) {
        lastIndex = i;
      }
    }

    String suffixPart = s.substring(lastIndex + 1);
    return new StringBuilder(suffixPart).reverse().toString() + s;
  }
}
