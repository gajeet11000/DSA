import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

  public int[] movesToStamp(String stamp, String target) {
    int stampLen = stamp.length();
    int targetLen = target.length();

    int numberOfStampPos = targetLen - stampLen + 1;

    int[] indegrees = new int[numberOfStampPos];
    Arrays.setAll(indegrees, value -> stampLen);

    Map<Integer, List<Integer>> graph = new HashMap<>();
    Deque<Integer> queue = new ArrayDeque<>();

    for (int i = 0; i < numberOfStampPos; i++) {
      for (int j = 0; j < stampLen; j++) {
        if (target.charAt(i + j) == stamp.charAt(j)) {
          indegrees[i]--;
          if (indegrees[i] == 0) {
            queue.offer(i);
          }
        } else {
          graph.put(i + j, graph.getOrDefault(i + j, new ArrayList<>()));
          graph.get(i + j).add(i);
        }
      }
    }

    List<Integer> result = new ArrayList<>();
    boolean[] visited = new boolean[targetLen];

    while (!queue.isEmpty()) {
      int i = queue.poll();
      result.add(i);

      for (int j = 0; j < stampLen; j++) {
        if (!visited[i + j]) {
          visited[i + j] = true;

          for (int k : graph.getOrDefault(i + j, List.of())) {

            indegrees[k]--;
            if (indegrees[k] == 0) {
              queue.offer(k);
            }
          }
        }
      }
    }

    for (boolean value : visited) {
      if (!value) {
        return new int[] {};
      }
    }

    return result.reversed()
        .stream()
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
