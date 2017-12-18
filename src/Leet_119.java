import java.util.LinkedList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].

 Note:
 Could you optimize your algorithm to use only O(k) extra space?
 */
public class Leet_119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> old = new LinkedList<Integer>();
		if(rowIndex<0)	return old;
		old.add(1);
		for(int i=0;i<rowIndex;i++){
			List<Integer> now = new LinkedList<Integer>();
			now.add(1);
			for(int j =1;j<old.size();j++){
				now.add(old.get(j-1)+old.get(j));
			}
			now.add(1);
			old = now;
		}
		return  old;
	}
	public static void main(String args[]){
		List<Integer> a = new Leet_119().getRow(3);
	}
}
