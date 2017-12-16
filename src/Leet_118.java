import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-12-16.
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]

 */
public class Leet_118 {
    public List<List<Integer>> generate(int numRows) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        List<Integer> old = new LinkedList<Integer>();
        for(int i=0;i<numRows;i++){
            LinkedList<Integer> element = new LinkedList<Integer>();
            element.add(1);
            for(int j=1;j<i;j++){
                element.add(old.get(j-1)+old.get(j));
            }
            if(element.size()<i+1)  element.add(1);
            old = element;
            result.add(element);
        }
        return result;
    }
    public static void main(String []args){
        List<List<Integer>> a = new Leet_118().generate(5);
    }
}
