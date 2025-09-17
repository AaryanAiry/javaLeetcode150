public int maxProfit(int[] prices) {
    int localProfit = 0;
    int sellPrice = prices[0];   // minimum price so far
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
        if (prices[i] < sellPrice)
            sellPrice = prices[i];  // update min price
        localProfit = prices[i] - sellPrice; // profit if sold today
        maxProfit = Math.max(maxProfit, localProfit); 
    }
    return (maxProfit > 0) ? maxProfit : 0;
}
