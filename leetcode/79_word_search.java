import java.util.HashMap;
import java.util.Map;

class Solution {
  private char[][] board;
  private String word;

  private int rows;
  private int cols;

  private int[] directions = { -1, 0, 1, 0, -1 };

  private boolean backtrack(int index, int x, int y) {
    if (index == word.length()) {
      return true;
    }

    if (x < 0 || y < 0 || x >= rows || y >= cols || board[x][y] == '#') {
      return false;
    }

    if (board[x][y] != word.charAt(index)) {
      return false;
    }

    char preserved = board[x][y];
    board[x][y] = '#';

    for (int i = 0; i < 4; i++) {
      int nx = x + directions[i];
      int ny = y + directions[i + 1];

      if (backtrack(index + 1, nx, ny)) {
        board[x][y] = preserved;
        return true;
      }
    }

    board[x][y] = preserved;
    return false;
  }

  public boolean exist(char[][] board, String word) {
    this.board = board;
    this.word = word;

    this.rows = board.length;
    this.cols = board[0].length;

    if (word.length() > rows * cols) {
      return false;
    }

    Map<Character, Integer> boardFreq = new HashMap<>();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        char ch = board[i][j];
        boardFreq.put(ch, boardFreq.getOrDefault(ch, 0) + 1);
      }
    }

    Map<Character, Integer> wordFreq = new HashMap<>();
    for (char ch : word.toCharArray()) {
      wordFreq.put(ch, wordFreq.getOrDefault(ch, 0) + 1);
    }

    for (var entry : wordFreq.entrySet()) {
      char ch = entry.getKey();
      int freq = entry.getValue();

      if (freq > boardFreq.getOrDefault(ch, 0)) {
        return false;
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (backtrack(0, i, j)) {
          return true;
        }
      }
    }

    return false;
  }
}
