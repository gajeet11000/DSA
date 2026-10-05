class Solution {
  public int findMin(int[] nums) {
    int mid = -1;
    int boundaryIndex = -1;

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      mid = (left + right) / 2;

      if (nums[mid] <= nums[nums.length - 1]) {
        boundaryIndex = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return nums[boundaryIndex];
  }
}
