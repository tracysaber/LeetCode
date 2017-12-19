import java.sql.SQLSyntaxErrorException;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class Leet_122 {
	public int maxProfit(int[] prices) {
		if(prices.length<=1)	return 0;
		int max = prices[0],min = prices[0],profit =0 ;
		for(int i=1;i<prices.length;i++){
			if(prices[i]>max)	max = prices[i];
			else{
				profit+=(max-min);
				max= min = prices[i];
			}
		}
		profit+=(max- min);
		return profit;
	}
	public static void main(String []args){
		int a[]={1,10,2,8,6,5};
		System.out.println(new Leet_122().maxProfit(a));
	}
}
