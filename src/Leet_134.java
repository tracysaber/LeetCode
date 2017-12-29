/**
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

 You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

 Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

 Note:
 The solution is guaranteed to be unique.
 */
public class Leet_134 {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas == null || cost == null || gas.length == 0 || gas.length != cost.length) {
			return -1;
		}
		int start = 0;
		int total = 0;
		int sum = 0;

		for (int i = 0; i < gas.length; i++) {
			total += (gas[i] - cost[i]);
			if (sum < 0) {
				sum = gas[i] - cost[i];
				start = i;
			} else {
				sum += (gas[i] - cost[i]);
			}
		}
		return total >= 0 ? start : -1;
	}
	public static void main(String args[]){
		int a[]={1,2};
		int b[]={2,1};
		System.out.print(new Leet_134().canCompleteCircuit(a,b));
	}
}
