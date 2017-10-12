/**
 * Created by tracysaber on 2017-10-11.
 * Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class Leet_28 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        for(int i =0;i<haystack.length();i++){
            if(haystack.length()-i<needle.length())
                return -1;

            int j=0;
            boolean flag = true;
            if(haystack.charAt(i)==needle.charAt(j)){
                for(j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(flag)
                    return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int a = new Leet_28().strStr("","");
    }
}
