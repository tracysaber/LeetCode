import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-10-5.
 * Given an array S of n integers, are there elements a, sb, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

 Note: The solution set must not contain duplicate quadruplets.

 For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

 A solution set is:
 [
 [-1,  0, 0, 1],
 [-2, -1, 1, 2],
 [-2,  0, 0, 2]
 ]
 */
public class Leet_18 {
    //public
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> re = new LinkedList<List<Integer>>();
        if(nums.length<4)
            return re;
//        if(nums.length==4)
//            if(nums[0]+nums[1]+nums[2]+nums[3]==target){
//                List<Integer> element = new LinkedList<Integer>();
//                element.add(nums[0]);
//                element.add(nums[1]);
//                element.add(nums[2]);
//                element.add(nums[3]);
//                re.add(element);
//                return re;
//            }

        Arrays.sort(nums);
        if(4*nums[0]>target || 4*nums[nums.length-1]<target)
            return re;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(l>k){
                    int sum =nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> element = new LinkedList<Integer>();
                        element.add(nums[i]);
                        element.add(nums[j]);
                        element.add(nums[k]);
                        element.add(nums[l]);
                        if(!re.contains(element))
                            re.add(element);
                    }
                    if(sum>target){
                        l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }
        return re;
    }
    public static void main(String args[]){
        int s[]={-1,0,1,2,-1,-4};
        List<List<Integer>> cc= new Leet_18().fourSum(s,-1);
        System.out.println();
    }
}
