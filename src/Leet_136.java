import java.util.HashSet;

/**
 * Created by tracysaber on 2017-12-30.
 */
public class Leet_136 {
    public int singleNumber(int []nums){
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(result.contains(nums[i]))    result.remove(nums[i]);
            else result.add(nums[i]);
        }
        return result.iterator().next();
    }
}
