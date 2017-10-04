import java.util.*;

/**
 * Created by tracysaber on 2017-10-2.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Note: The solution set must not contain duplicate triplets.

 For example, given array S = [-1, 0, 1, 2, -1, -4],

 A solution set is:
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */
public class Leet_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> re = new LinkedHashSet<List<Integer>>();
        //List<List<Integer>> re = new LinkedList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> element = new LinkedList<Integer>();
                    element.add(nums[i]);
                    element.add(nums[j]);
                    element.add(nums[k]);
                    if(!re.contains(element))
                        re.add(element);
                }
                if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<List<Integer>>(re);
    }
    public static void main(String args[]){
        int ss []= {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> re = new Leet_15().threeSum(ss);
    }
}
