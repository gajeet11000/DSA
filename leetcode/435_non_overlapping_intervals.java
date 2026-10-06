import java.util.Arrays;
import java.util.Comparator;

class Solution {
  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

    int end = Integer.MIN_VALUE;
    int removed = 0;

    for (int[] interval : intervals) {
      if (interval[0] < end) {
        removed++;
      } else {
        end = interval[1];
      }
    }

    return removed;
  }
}
