/**
 * Created by tracysaber on 2017-10-1.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Leet_13 {
    public String longestCommonPrefix(String[] strs) {

        int len = strs.length;
        if (len==0)
            return "";
        int min = strs[0].length();
        for(int i =0;i<len;i++){
            if(strs[i].length()<min)
                min=strs[i].length();
        }
        int count=0;
        for(int i =0;i<min;i++){
            boolean flag =true;
            count=i;
            for(int j=1;j<len;j++){
                //boolean flag =true;
                if(strs[j].charAt(i)!=strs[0].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                count=i;
                break;
            }
        }
        return strs[0].substring(0,count+1);
    }
    public static void main(String args[]){
        String strs[]={"you","yo","yoyoyo"};
        System.out.println(new Leet_13().longestCommonPrefix(strs));
    }
}
