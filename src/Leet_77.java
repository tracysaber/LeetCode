import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * created by tracysaber
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]

 */
public class Leet_77 {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		//List<Integer> element = new LinkedList<Integer>();
		Integer []element = new Integer[k];
		int index =0;
		dfs(element,result,n,k,index);
		return result;
	}
	public void dfs (Integer [] pre,List<List<Integer>> re,int n ,int k , int index){
		if(index==k){
			List<Integer> newelement = new LinkedList<Integer>();
			for(int i=0;i<pre.length;i++){
				newelement.add(pre[i]);
			}
			re.add(newelement);
			return;
		}
		else{
			if(index==0){
				for(int i=1;i<=n-k+1;i++){
					pre[index]=i;
					dfs(pre,re,n,k,index+1);
				}
			}
			else{
				int last = pre[index-1];
				for(int i=last+1 ;i<=n-k+1+index;i++){
					pre[index]=i;
					dfs(pre,re,n,k,index+1);
				}
			}
		}
	}
	public static void main(String []args){
		List<List<Integer>> a = new Leet_77().combine(4,2);
	}
}
