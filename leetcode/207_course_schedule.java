import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Kahn's Algorithm
class BfsTopologicalSort {
  public boolean solve(int numCourses, int[][] prerequisites) {

    List<List<Integer>> prereqToCourses = new ArrayList<>();

    for (int i = 0; i < numCourses; i++) {
      prereqToCourses.add(new ArrayList<>());
    }

    int[] indegrees = new int[numCourses];

    for (int[] prereqs : prerequisites) {
      int course = prereqs[0];
      int prereq = prereqs[1];

      indegrees[course]++;
      prereqToCourses.get(prereq).add(course);
    }

    Deque<Integer> queue = new ArrayDeque<>();

    for (int i = 0; i < numCourses; i++) {
      if (indegrees[i] == 0) {
        queue.offer(i);
      }
    }

    while (!queue.isEmpty()) {
      int course = queue.poll();

      for (int prereq : prereqToCourses.get(course)) {
        indegrees[prereq]--;

        if (indegrees[prereq] == 0) {
          queue.offer(prereq);
        }
      }
      numCourses--;
    }

    return numCourses == 0;
  }
}

class DfsCycleDetection {

  private Map<Integer, List<Integer>> map = new HashMap<>();
  private Set<Integer> path = new HashSet<>();
  private Set<Integer> solved = new HashSet<>();

  private boolean canComplete(int course) {
    if (solved.contains(course)) {
      return true;
    }

    if (path.contains(course)) {
      return false;
    }

    path.add(course);

    for (int prereq : map.get(course)) {
      if (!canComplete(prereq)) {
        return false;
      }
    }

    path.remove(course);
    solved.add(course);

    return true;
  }

  public boolean solve(int numCourses, int[][] prerequisites) {

    for (int i = 0; i < numCourses; i++) {
      map.put(i, new ArrayList<>());
    }

    for (int[] prereqs : prerequisites) {
      int course = prereqs[0];
      int prereq = prereqs[1];
      map.get(course).add(prereq);
    }

    for (int i = 0; i < numCourses; i++) {
      if (!canComplete(i)) {
        return false;
      }
      path.clear();
    }

    return true;
  }
}

class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    return new BfsTopologicalSort().solve(numCourses, prerequisites);
    // return new DfsCycleDetection().solve(numCourses, prerequisites);
  }
}
