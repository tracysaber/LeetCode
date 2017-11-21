/**
 * @author tracysaber
 *Implement pow(x, n).
 */
public class Leet_50 {
	public double myPow(double x, int m) {
		double temp = x;
		if (m == 0)
			return 1;
		temp = myPow(x, m / 2);
		if (m % 2 == 0)
			return temp * temp;
		else {
			if (m > 0)
				return x * temp * temp;
			else
				return (temp * temp) / x;
		}
	}
	public static void main(String args[]){
		System.out.println(new Leet_50().myPow(2.00000
				,-2147483647));
	}
}
