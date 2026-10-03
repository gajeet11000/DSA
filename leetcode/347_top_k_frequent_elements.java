import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    PriorityQueue<Integer> pQueue = new PriorityQueue<>(
        Comparator.comparingInt(map::get));

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    map.forEach((key, value) -> {
      pQueue.add(key);
      if (pQueue.size() > k) {
        pQueue.poll();
      }
    });

    int result[] = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = pQueue.poll();
    }

    return result;
  }
}
