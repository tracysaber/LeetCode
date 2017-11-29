import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-11-28.
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

 'A' -> 1
 'B' -> 2
 ...
 'Z' -> 26
 Given an encoded message containing digits, determine the total number of ways to decode it.

 For example,
 Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

 The number of ways decoding "12" is 2.t
 */
public class Leet_91 {
//    public int numDecodings(String s) {
//        List<List<Character>> result = new LinkedList<List<Character>>();
//        if(s.length()==0) return 0;
//        back(result,new LinkedList<Character>(),s,0);
//        return result.size();
//    }
//    public void back(List<List<Character>> list,List<Character> a,String s,int index){
//        if(index==s.length()) {
//            if(!a.contains('0'))
//                list.add(new ArrayList<Character>(a));
//        }
//        else{
//            a.add(s.charAt(index));
//            back(list, a, s, index + 1);
//            a.remove(a.size() - 1);
//
//            if (s.length() - index > 1) {
//                int num = Integer.valueOf(s.substring(index, index + 2));
//                if (num >= 1 && num <= 26) {
//                    a.add(s.charAt(index));
//                    back(list, a, s, index + 2);
//                    a.remove(a.size() - 1);
//                }
//            }
//        }
//    }
public int numDecodings(String s) {
    int n = s.length();
    if (n == 0) return 0;

    int[] memo = new int[n+1];
    memo[n]  = 1;
    memo[n-1] = s.charAt(n-1) != '0' ? 1 : 0;

    for (int i = n - 2; i >= 0; i--)
        if (s.charAt(i) == '0') continue;
        else memo[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? memo[i+1]+memo[i+2] : memo[i+1];

    return memo[0];
}
    public static void main(String args[]){
        System.out.println(new Leet_91().numDecodings("4757562545844617494555774581341211511296816786586787755257741178599337186486723247528324612117156948"));
    }
}
