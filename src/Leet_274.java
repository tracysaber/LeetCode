import java.util.Arrays;

/**
 * Created by tracysaber on 2018-7-27.
 * Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

 According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N ? h papers have no more than h citations each."

 Example:

 Input: citations = [3,0,6,1,5]
 Output: 3
 Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had
 received 3, 0, 6, 1, 5 citations respectively.
 Since the researcher has 3 papers with at least 3 citations each and the remaining
 two with no more than 3 citations each, her h-index is 3.
 Note: If there are several possible values for h, the maximum one is taken as the h-index.
 */
public class Leet_274 {
    public int hIndex(int[] citations) {
        if(citations.length==0) return 0;
        Arrays.sort(citations);
        int low =0,high = citations.length-1;
        while(low<high){
            int mid = low +(high-low)/2;
            int count = high -mid+1;
            if(citations[mid]<count)    low = mid+1;
            else {if(citations[mid]>count)    high = mid-1;
            else    return citations[mid];}
        }
        for(int i = citations[low]-1;i>citations[high];i--){
            if(i==citations.length-low)
                return i;
        }
        return 0;
    }
    public  static void main(String args[]){
        int a [] ={11,15};
        System.out.print(new Leet_274().hIndex(a));
    }
}
