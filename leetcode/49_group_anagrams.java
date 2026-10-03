import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();

    for (String string : strs) {
      char arr[] = string.toCharArray();
      Arrays.sort(arr);
      String sorted = new String(arr);

      map.put(sorted, map.getOrDefault(sorted, new ArrayList<>()));
      map.get(sorted).add(string);
    }

    return new ArrayList<>(map.values());
  }
}
