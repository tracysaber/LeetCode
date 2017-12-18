import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-12-18.
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle
 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 */
public class Leet_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result[] =new int[triangle.size()+1];
        for(int i =triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                result[j] = Math.min(result[j],result[j+1])+triangle.get(i).get(j);
            }
        }
        return result[0];
    }
    public static void main(String []args){
        List<List<Integer>> a = new LinkedList<List<Integer>>();
       // a.add()
    }
}
