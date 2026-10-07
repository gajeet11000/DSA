import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class DfsSolution {
  private int rows;
  private int cols;
  private int[][] heights;

  private int[] directions = { -1, 0, 1, 0, -1 };

  private void dfs(boolean[][] checked, int r, int c) {
    if (checked[r][c]) {
      return;
    }

    checked[r][c] = true;

    for (int i = 0; i < 4; i++) {
      int nr = r + directions[i];
      int nc = c + directions[i + 1];

      if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || checked[nr][nc]) {
        continue;
      }

      if (heights[nr][nc] >= heights[r][c]) {
        dfs(checked, nr, nc);
      }
    }
  }

  public List<List<Integer>> solve(int[][] heights) {
    rows = heights.length;
    cols = heights[0].length;
    this.heights = heights;

    boolean[][] pacific = new boolean[rows][cols];
    boolean[][] atlantic = new boolean[rows][cols];

    for (int col = 0; col < cols; col++) {
      dfs(pacific, 0, col);
      dfs(atlantic, rows - 1, col);
    }

    for (int row = 0; row < rows; row++) {
      dfs(pacific, row, 0);
      dfs(atlantic, row, cols - 1);
    }

    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (pacific[i][j] && atlantic[i][j]) {
          result.add(List.of(i, j));
        }
      }
    }

    return result;
  }
}

class BfsSolution {
  private int rows;
  private int cols;
  private int[][] heights;

  private final int[] directions = { -1, 0, 1, 0, -1 };

  private record Pair(int x, int y) {
  }

  private void bfs(Deque<Pair> queue, boolean[][] visited) {
    while (!queue.isEmpty()) {
      Pair pair = queue.poll();

      int x = pair.x;
      int y = pair.y;

      for (int i = 0; i < 4; i++) {
        int nx = x + directions[i];
        int ny = y + directions[i + 1];

        if (nx < 0 || ny < 0 || nx >= rows || ny >= cols || visited[nx][ny]) {
          continue;
        }

        if (heights[nx][ny] >= heights[x][y]) {
          visited[nx][ny] = true;
          queue.offer(new Pair(nx, ny));
        }
      }
    }
  }

  public List<List<Integer>> solve(int[][] heights) {
    this.rows = heights.length;
    this.cols = heights[0].length;
    this.heights = heights;

    boolean[][] pacificVisited = new boolean[rows][cols];
    boolean[][] atlanticVisited = new boolean[rows][cols];

    Deque<Pair> pacificQueue = new ArrayDeque<>();
    Deque<Pair> atlanticQueue = new ArrayDeque<>();

    for (int col = 0; col < cols; col++) {
      pacificQueue.offer(new Pair(0, col));
      pacificVisited[0][col] = true;

      atlanticQueue.offer(new Pair(rows - 1, col));
      atlanticVisited[rows - 1][col] = true;
    }

    for (int row = 0; row < rows; row++) {
      pacificQueue.offer(new Pair(row, 0));
      pacificVisited[row][0] = true;

      atlanticQueue.offer(new Pair(row, cols - 1));
      atlanticVisited[row][cols - 1] = true;
    }

    bfs(pacificQueue, pacificVisited);
    bfs(atlanticQueue, atlanticVisited);

    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (pacificVisited[i][j] && atlanticVisited[i][j]) {
          result.add(List.of(i, j));
        }
      }
    }

    return result;
  }
}

class Solution {
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    return new BfsSolution().solve(heights);
    // return new DfsSolution().solve(heights);
  }
}
