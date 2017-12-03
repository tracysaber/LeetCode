/**
 * Created by tracysaber on 2017-12-3.
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

 For example,
 Given:
 s1 = "aabcc",
 s2 = "dbbca",

 When s3 = "aadbbcbcac", return true.
 When s3 = "aadbbbaccc", return false.
 */
public class Leet_97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
            return false;
        boolean result[][] = new boolean[s2.length()+1][s1.length()+1];
        result[0][0] = true;
        for(int i=1;i<result[0].length;i++){
            result[0][i]=result[0][i-1]&&(s1.charAt(i-1)==s3.charAt(i-1));
        }
        for(int i=1;i<result.length;i++){
            result[i][0]=result[i-1][0]&&(s2.charAt(i-1)==s3.charAt(i-1));
        }
        for(int i=1;i<result.length;i++){
            for(int j=1;j<result[0].length;j++){
                result[i][j] = (result[i-1][j]&&(s2.charAt(i-1)==s3.charAt(i+j-1)))||(result[i][j-1]&&(s1.charAt(j-1)==s3.charAt(i+j-1)));
            }
        }
        return result[result.length-1][result[0].length-1];
    }

//	public boolean isInterleave(String s1, String s2, String s3) {
//		return back(s1,s2,s3,0,0,0);
//	}
//	public boolean back(String s1,String s2,String s3,int i,int j,int index){
//		//boolean flag = false;
//		if(i==s1.length()&&j==s2.length()&&index ==s3.length()){
//			return true;
//		}
//		else {
//			if(i<s1.length()&&index<s3.length()&&s1.charAt(i)==s3.charAt(index)){
//				if(back(s1,s2,s3,i+1,j,index+1))
//					return true;
//			}
//			if(j<s2.length()&&index<s3.length()&&s2.charAt(j)==s3.charAt(index)){
//				return back(s1,s2,s3,i,j+1,index+1);
//			}
//		}
//		return false;
//	}
	public static void main(String args[]){
		System.out.println(new Leet_97().isInterleave("db","b","cbb"));
	}

}
