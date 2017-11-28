import java.util.*;

/**
 * Created by tracysaber on 2017-11-27.
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,2], a solution is:

 [
 [2],
 [1],
 [1,2,2],
 [2,2],
 [1,2],
 []
 ]

 */
public class Leet_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        addElement(result, new LinkedList<Integer>(), nums, 0);
        return new ArrayList<List<Integer>>(result);
    }
    public void addElement(Set<List<Integer>> List,List<Integer> tempList,int []nums,int index){
        List.add(new ArrayList<Integer>(tempList));
        for(int i=index;i<nums.length;i++){
            tempList.add(nums[i]);
            addElement(List,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
    public static void main(String []args){
        int n[]={1,2,2};
        List<List<Integer>> a= new Leet_90().subsetsWithDup(n);
    }
}
