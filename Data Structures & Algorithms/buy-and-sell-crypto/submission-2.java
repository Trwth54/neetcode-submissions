// You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.

// You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.

// Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0. 

////// BIG BRAIN TIME //////////
/// Go through the array, checking all remaining elements
/// Basically go through every possible combination to see what works
/// May need to use a 3d array

public class Solution {
    public static int maxProfit(int[] prices) 
        {
            // Indices of best result
            int bestBuy = 0; // index of best buy day
            int bestSell = 0; // index of best sell day
            int profit; // profit of current day (in loop)
            int maxProfit = 0; // int of max profit from best days

            for (int b = 0; b < prices.length; b++)
            {
                for (int s = b + 1; s < prices.length; s++)
                {
                    profit = prices[s] - prices[b];

                    // saves profit and indices for later
                    if (profit > maxProfit)
                    {
                        maxProfit = profit;
                        bestBuy = b; // buy index
                        bestSell = s; // sell index
                    }
                }
            }

            System.out.println("Best buy day: " + bestBuy + " ($" + prices[bestBuy] + ")");
            System.out.println("Best sell day: " + bestSell + " ($" + prices[bestSell] + ")");

            // get best results
            return maxProfit;
        }
    
        public int largestValue(int[] numArray)
        {
            int largest = numArray[0]; // assume first array is largest
            
            for (int element : numArray)
            {
                if (largest < numArray[element])
                    largest = numArray[element];
            }
    
            return largest;
        }
    
        public int cheapestValue(int[] numArray)
        {
            int cheapest = numArray[0]; // assume first array is largest
            
            for (int element : numArray)
            {
                if (cheapest > numArray[element])
                    cheapest = numArray[element];
            }
    
            return cheapest;
        }
    
        public static void main(String[] args) {
            int[] prices = new int[] {7, 6, 4, 3, 1};
    
            System.out.println(maxProfit(prices));
    }
}
