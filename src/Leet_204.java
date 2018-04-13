/**
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class Leet_204 {
	public boolean isPrime(int num){
		for(int i=2;i<num/2;i++){
			if(num%i==0)	return false;
		}
		return true;
	}
	public int countPrimes(int n) {
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (notPrime[i] == false) {
				count++;
				for (int j = 2; i*j < n; j++) {
					notPrime[i*j] = true;
				}
			}
		}

		return count;
	}
	public static void main(String args[]){
		System.out.print(new Leet_204().countPrimes(499979));
	}
}
