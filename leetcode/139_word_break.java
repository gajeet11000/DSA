import java.util.List;

class Solution {
  private String s;
  private List<String> wordDict;
  private boolean[] failed;

  private boolean backtrack(int pos) {
    if (pos == s.length()) {
      return true;
    }

    if (failed[pos]) {
      return false;
    }

    for (int i = 0; i < wordDict.size(); i++) {
      String word = wordDict.get(i);
      int wordLen = word.length();

      if (s.startsWith(word, pos)) {
        if (backtrack(pos + wordLen)) {
          return true;
        }
      }
    }

    failed[pos] = true;
    return false;
  }

  public boolean wordBreak(String s, List<String> wordDict) {
    this.s = s;
    this.wordDict = wordDict;
    failed = new boolean[s.length()];

    return backtrack(0);
  }
}
