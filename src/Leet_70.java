/**
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 Note: Given n will be a positive integer.


 Example 1:

 Input: 2
 Output:  2
 Explanation:  There are two ways to climb to the top.

 1. 1 step + 1 step
 2. 2 steps
 Example 2:

 Input: 3
 Output:  3
 Explanation:  There are three ways to climb to the top.

 1. 1 step + 1 step + 1 step
 2. 1 step + 2 steps
 3. 2 steps + 1 step
 */
public class Leet_70 {
	public int climbStairs(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		else{
			int first=1;
			int second = 2;
			int count =3;
			int now =0;
			while(count<=n){
				now = first + second;
				first = second;
				second = now;
				count++;
			}
			return now;
		}
	}
	public static void main(String args[]){
		System.out.println(new Leet_70().climbStairs(44));
	}
}
