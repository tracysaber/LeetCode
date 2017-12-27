import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by tracysaber on 2017-12-26.
 * Given a string s, partition s such that every substring of the partition is a palindrome.

 Return all possible palindrome partitioning of s.

 For example, given s = "aab",
 Return

 [
 ["aa","b"],
 ["a","a","b"]
 ]

 */
public class Leet_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<List<String>>();
        if(s.length()==0)
            return result;
        if(s.length()==1){
            LinkedList<String> one = new LinkedList<String>();
            one.add(s);
            result.add(one);
            return result;
        }
        List<List<String>> re = partition(s.substring(1));
        for(int i=0;i < re.size();i++){
            List<String> a = re.get(i);
            a.add(0,String.valueOf(s.charAt(0)));
            result.add(new LinkedList<String>(a));
            if(isP(s.charAt(0)+a.get(1))){
                List<String> b= new LinkedList<String>(re.get(i));
                b.remove(0);
                b.set(0, s.charAt(0) + b.get(0));
                if(!result.contains(b)) result.add(new LinkedList<String>(b));
            }
            if(a.size()>=3&&a.get(2).equals(String.valueOf(s.charAt(0)))){
                List<String> c= new LinkedList<String>(re.get(i));
                c.remove(0);
                c.add(0, s.charAt(0) + c.get(0)+c.get(1));
                c.remove(1);
                c.remove(1);
                if(!result.contains(c)) result.add(new LinkedList<String>(c));
            }
        }
        return result;
    }
    public boolean isP(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String args[]){
        List<List<String>> a = new Leet_131().partition("cbbbcc");
    }
}
