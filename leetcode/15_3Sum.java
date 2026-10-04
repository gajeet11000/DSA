import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {

      int target = nums[i];

      if (target > 0) {
        break;
      }

      if (i > 0 && nums[i - 1] == target) {
        continue;
      }

      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int total = nums[left] + nums[right];

        if (total == -target) {
          result.add(Arrays.asList(nums[left], nums[right], target));

          left++;
          right--;

          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
        } else if (total < -target) {
          left++;
        } else {
          right--;
        }
      }
    }

    return result;
  }
}
