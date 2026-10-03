class Solution {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minBuyingPrice = Integer.MAX_VALUE;

    for (int price : prices) {
      maxProfit = Math.max(maxProfit, price - minBuyingPrice);
      minBuyingPrice = Math.min(minBuyingPrice, price);
    }

    return maxProfit;
  }
}
