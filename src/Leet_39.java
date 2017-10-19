import java.util.*;
/**
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]

 */
public class Leet_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length==0)
            return null;
        Arrays.sort(candidates);
        if(target <candidates[0])
            return new LinkedList<List<Integer>>();
        else{
            Set<List<Integer>> result = new HashSet<List<Integer>>();
            for(int i=0;i<candidates.length;i++){
                if(target>candidates[i]) {
                    List<List<Integer>> current = combinationSum(candidates, target - candidates[i]);
                    if(current!=null) {
                        for (int j = 0; j < current.size(); j++) {
                            current.get(j).add(candidates[i]);
                            Collections.sort(current.get(j));
                            result.add(current.get(j));
                        }
                    }
                }
                if(target ==candidates[i]) {
                    List<Integer> self = new LinkedList<Integer>();
                    self.add(candidates[i]);
                    result.add(self);
                }
            }
            return new ArrayList<List<Integer>>(result);
        }
    }
    public static void main(String args[]){
        int nums[] = {2, 3, 6, 7};
        List<List<Integer>> a = new Leet_39().combinationSum(nums,7);
    }
}
