import java.util.HashSet;
import java.util.Set;

public class Leet_202 {
	public boolean isHappy(Set<Integer> a, int n){
		int m=0;
		a.add(n);
		while(n>0){
			int lowest = n%10;
			m += (lowest*lowest);
			n /=10;
		}
		if(m==1)	return true;
		if(a.contains(m))	return false;
		else return isHappy(a,m);

	}
	public boolean isHappy(int n) {
		return isHappy(new HashSet<Integer>(),n);
//		if(n%10==1)	return true;
//		int m=0;
//		while(n>0){
//			int lowest = n%10;
//			m += (lowest*lowest);
//			n /=10;
//		}
//		if(m==1)	return true;
//		if(m<10)	return false;
//		else	return isHappy(m);
	}
	public static void main(String args[]){
		System.out.print(new Leet_202().isHappy(6));
	}
}
