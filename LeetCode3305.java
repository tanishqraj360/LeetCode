class LeetCode3305 {
  public int countOfSubstrings(String word, int k) {
    int ans = 0;
    int n = word.length();

    for (int l = 0; l < n; l++) {
      int a = 0, e = 0, i = 0, o = 0, u = 0, c = 0;
      for (int j = l; j < n; j++) {
        if (word.charAt(j) == 'a') {
          a++;
        } else if (word.charAt(j) == 'e') {
          e++;
        } else if (word.charAt(j) == 'i') {
          i++;
        } else if (word.charAt(j) == 'o') {
          o++;
        } else if (word.charAt(j) == 'u') {
          u++;
        } else {
          c++;
        }

        if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && c == k) {
          ans++;
        }
      }
    }
    return ans;
  }
}
