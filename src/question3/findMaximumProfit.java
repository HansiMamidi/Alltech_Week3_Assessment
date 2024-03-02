package question3;

import java.util.HashMap;
import java.util.Map;

public class findMaximumProfit {
	long profit;
	long totalProfit=0;

	public long findMax(int[] category, int[] price) {
		int n = category.length;

        // Create a map to store the last index at which each category was sold
        Map<Integer, Integer> lastSoldIndex = new HashMap<>();

        long totalProfit = 0;
        long[] categoryCount = new long[n];

        for (int i = 0; i < n; i++) {
            int currentCategory = category[i];
            int currentPrice = price[i];

            // Calculate profit for the current item
            long profit = currentPrice * (i - lastSoldIndex.getOrDefault(currentCategory, -1));
            totalProfit += profit;

            // Update the count and last sold index for the current category
            categoryCount[currentCategory - 1]++;
            lastSoldIndex.put(currentCategory, i);
        }

        return totalProfit;
	}

}
