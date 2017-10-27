import java.util.*;

/**
 * Created by tracysaber on 2017-10-27.
 * Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]

 */
public class Leet_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(nums.length==0)
            return result;
        if(nums.length==1){
            List<Integer> a = new LinkedList<Integer>();
            a.add(nums[0]);
            result.add(a);
            return result;
        }
        else{
            int last = nums[nums.length-1];
            nums= Arrays.copyOf(nums,nums.length-1);
            Set<List<Integer>> re = new HashSet<List<Integer>>();
            List<List<Integer>> ex =permute(nums);
            for(int i=0;i<ex.size();i++){
                List<Integer> element = ex.get(i);
                for(int j=0;j<element.size()+1;j++){
                    List<Integer> it = new LinkedList<Integer>(element);
                    it.add(j,last);
                    if(!re.contains(it))
                        re.add(it);
                }
            }
            return new LinkedList<List<Integer>>(re);
        }
    }
    public static void main(String args[]){
        int a[] ={1,2,3};
        List<List<Integer>> r=new Leet_46().permute(a);
    }
}
