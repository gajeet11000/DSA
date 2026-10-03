class Solution {
  public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      int lv = height[left];
      int rv = height[right];

      maxArea = Math.max(maxArea, Math.min(lv, rv) * (right - left));

      if (lv < rv) {
        left++;
      } else {
        right--;
      }
    }

    return maxArea;
  }
}
