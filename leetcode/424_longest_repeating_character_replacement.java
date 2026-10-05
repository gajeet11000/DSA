import java.util.HashMap;

class Solution {
  public int characterReplacement(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();

    int longest = 0;

    int left = 0;
    int right = 0;
    int maxFreq = 0;

    while (right < s.length()) {
      char ch = s.charAt(right);
      map.put(ch, map.getOrDefault(ch, 0) + 1);

      maxFreq = Math.max(maxFreq, map.get(ch));

      if ((right - left + 1 - maxFreq) > k) {
        char chl = s.charAt(left);
        map.put(chl, map.get(chl) - 1);
        left++;
      }

      longest = Math.max(longest, right - left + 1);

      right++;
    }

    return longest;
  }
}
