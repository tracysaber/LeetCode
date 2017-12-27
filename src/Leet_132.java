/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.

 Return the minimum cuts needed for a palindrome partitioning of s.

 For example, given s = "aab",
 Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 */
public class Leet_132 {
	public int minCut(String s) {
		boolean dp[][]=new boolean [s.length()][s.length()];
		int len = s.length();
		int re[] = new int [len];
		for(int i=len-1;i>=0;i--){
			re[i] = len-1-i;
			for(int j=len-1;j>=i;j--){
				//if(isP(s.substring(i,j+1))){
				if(s.charAt(i)==s.charAt(j)&&(j-i<2||dp[i+1][j-1])){
					dp[i][j]=true;
					if(j==len-1) re[i]=0;
					else{
						re[i] = Math.min(re[i],1+re[j+1]);
					}
				}
				else
					dp[i][j]=false;
			}
		}
		return re[0];
	}
	public boolean isP(String s){
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}
	public static void main(String args[]){
		System.out.println(new Leet_132().minCut("mmp"));
	}
}
