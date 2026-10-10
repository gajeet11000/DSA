import java.util.HashMap;
import java.util.Map;

class Solution {
  private int[] nums;
  private Map<Integer, Integer> memo;

  private int dfs(int index) {
    if (index >= nums.length) {
      return 0;
    }

    if (memo.containsKey(index)) {
      return memo.get(index);
    }

    int skip = dfs(index + 1);
    int rob = nums[index] + dfs(index + 2);

    int result = Math.max(skip, rob);

    memo.put(index, result);
    return result;
  }

  public int rob(int[] nums) {
    this.nums = nums;
    this.memo = new HashMap<>();

    return dfs(0);
  }
}
