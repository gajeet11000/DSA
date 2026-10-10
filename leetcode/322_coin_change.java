import java.util.Arrays;

class Solution {
  private int[] coins;
  private int[][] memo;

  private int dfs(int index, int amount) {
    if (amount == 0) {
      return 0;
    }

    if (index < 0 || amount < coins[0]) {
      return Integer.MAX_VALUE;
    }

    if (memo[index][amount] != -1) {
      return memo[index][amount];
    }

    int without = dfs(index - 1, amount);
    int with = dfs(index, amount - coins[index]);

    if (with != Integer.MAX_VALUE) {
      with++;
    }

    return memo[index][amount] = Math.min(without, with);
  }

  public int coinChange(int[] coins, int amount) {
    Arrays.sort(coins);
    this.coins = coins;

    this.memo = new int[coins.length][amount + 1];

    for (int[] mem : memo) {
      Arrays.fill(mem, -1);
    }

    int result = dfs(coins.length - 1, amount);
    if (result == Integer.MAX_VALUE) {
      return -1;
    }
    return result;
  }
}
