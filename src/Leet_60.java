import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-11-23.
 * The set [1,2,3,бн,n] contains a total of n! unique permutations.

 By listing and labeling all of the permutations in order,
 We get the following sequence (ie, for n = 3):

 "123"
 "132"
 "213"
 "231"
 "312"
 "321"
 Given n and k, return the kth permutation sequence.

 Note: Given n will be between 1 and 9 inclusive.
 */
public class Leet_60 {
    public String getPermutation(int n, int k) {
        int f[]= new int[n];
        List<Integer> num = new LinkedList<Integer>();
        int sum=1;
        for(int i=0;i<n;i++){
            sum*=(i+1);
            f[i]=sum;
        }
        for(int i=0;i<n;i++){
            num.add(i+1);
        }
        int index =0;
        StringBuilder result = new StringBuilder();
        k--;
        while (num.size()>1){
            index = k/(f[num.size()-2]);
            k = k%f[num.size()-2];
            result.append(num.get(index));
            num.remove(index);
        }
        result.append(num.get(0));
        return result.toString();
    }
    public static void main(String []args){
        System.out.println(new Leet_60().getPermutation(4,1));
    }
}
