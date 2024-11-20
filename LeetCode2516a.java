class LeetCode2516a {
  public int takeCharacters(String s, int k) {
    int n = s.length();
    int count[] = new int[3];

    for (char ch : s.toCharArray()) {
      count[ch - 'a']++;
    }

    for (int i = 0; i < 3; i++) {
      if (count[i] < k)
        return -1;
    }

    int curr[] = new int[3];
    int left = 0;
    int right = 0;
    int maxWindow = 0;

    while (right < n) {
      char ch = s.charAt(right);
      curr[ch - 'a']++;

      while (left <= right && count[ch - 'a'] - curr[ch - 'a'] < k) {
        curr[s.charAt(left) - 'a']--;
        left++;
      }

      maxWindow = Math.max(maxWindow, right - left + 1);
      right++;

    }

    return n - maxWindow;
  }
}
