import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
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

  public boolean canFinish(int numCourses, int[][] prerequisites) {

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
