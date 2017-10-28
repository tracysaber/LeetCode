import java.util.*;

/**
 * Created by tracysaber on 2017-10-28.
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

 For example,
 [1,1,2] have the following unique permutations:
 [
 [1,1,2],
 [1,2,1],
 [2,1,1]
 ]

 */
public class Leet_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
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
            nums= Arrays.copyOf(nums, nums.length - 1);
            Set<List<Integer>> re = new HashSet<List<Integer>>();
            List<List<Integer>> ex = permuteUnique(nums);
            for(int i=0;i<ex.size();i++){
                List<Integer> element = ex.get(i);
                for(int j=0;j<element.size()+1;j++){
                    List<Integer> it = new LinkedList<Integer>(element);
                    if(j==element.size()||element.get(j)!=last) {
                        it.add(j, last);
                        if(!re.contains(it))
                            re.add(it);
                    }

                }
            }
            return new LinkedList<List<Integer>>(re);
        }
    }
    public static void main(String args[]){
        int a[]={1,1,2};
        List<List<Integer>> re = new Leet_47().permuteUnique(a);
    }
}
