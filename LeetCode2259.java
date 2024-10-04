public class LeetCode2259 {
  public String removeDigit(String number, char digit) {
    String res = "";
    for (int i = 0; i < number.length(); i++) {
      if (number.charAt(i) == digit) {
        String temp = number.substring(0, i) + number.substring(i + 1);
        if (res.equals("") || temp.compareTo(res) > 0) {
          res = temp;
        }
      }
    }
    return res;
  }
}
