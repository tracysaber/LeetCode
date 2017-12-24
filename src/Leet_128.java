import java.util.LinkedList;

/**
 * Created by tracysaber on 2017-12-24.
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

 For example,
 Given [100, 4, 200, 1, 3, 2],
 The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

 Your algorithm should run in O(n) complexity.
 */
public class Leet_128 {
    class Con{
        int first;
        int next;
        int length;
        public Con(int num){
            this.first = num;
            this.length =1;
            this.next = ++num;
        }
    }
    public int longestConsecutive(int[] nums) {
        LinkedList<Con> re = new LinkedList<Con>();
        for(int i=0;i<nums.length;i++){
            int j=0;
            while(j<re.size()&&re.get(j).first<nums[i]){
                j++;
            }
            if(re.get(j-1).next==nums[i]){
                if(re.get(j).first==nums[i]+1){
                    
                }
                else{
                    Con temp = re.get(j-1);
                    temp.next++;
                    temp.length++;
                }
            }
        }
    }
}
