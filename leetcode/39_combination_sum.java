import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  private int[] candidates;
  private List<List<Integer>> result;
  private List<Integer> stack;

  private void backtrack(int index, int target) {
    if (target == 0) {
      result.add(new ArrayList<>(stack));
      return;
    }

    for (int i = index; i < candidates.length; i++) {
      int num = candidates[i];

      if (num > target) {
        break;
      }

      stack.add(num);

      backtrack(i, target - num);

      stack.remove(stack.size() - 1);
    }
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);

    this.candidates = candidates;
    result = new ArrayList<>();
    stack = new ArrayList<>();

    backtrack(0, target);

    return result;
  }
}
