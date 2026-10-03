import java.util.HashSet;

class Solution {
  public int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {
      set.add(num);
    }

    int longest = 0;
    int curr = 1;

    for (int num : set) {
      if (set.contains(num - 1)) {
        continue;
      }

      while (set.contains(num + 1)) {
        curr++;
        num++;
      }

      longest = Math.max(longest, curr);
      curr = 1;
    }

    return longest;

  }
}
