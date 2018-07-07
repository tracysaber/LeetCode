/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit. You may complete at most k transactions.

 Note:
 You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

 Example 1:

 Input: [2,4,1], k = 2
 Output: 2
 Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
 Example 2:

 Input: [3,2,6,5,0,3], k = 2
 Output: 7
 Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4.
 Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.

 */
public class Leet_188 {
	public int maxProfit(int k, int[] prices) {
		int best[] = new int[prices.length];
		int times[] = new int[prices.length];
		int max=0;
		for(int i=1;i<best.length;i++){
			for(int j=0;j<i;j++){
				if(times[j]<k&&prices[i]>prices[j]){
					if(prices[i]-prices[j]+best[j]>best[i]){
						best[i] =prices[i]-prices[j]+best[j];
						times[i] = times[j]+1;
					}
				}
			}
			max = Math.max(max,best[i]);
		}
		return best[prices.length-1];
	}
	public static void main(String args[]){
		int p[]={3,2,6,5,0,3};
		System.out.print(new Leet_188().maxProfit(2,p));
	}
}
