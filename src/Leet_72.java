/**
 * Created by tracysaber on 2017-11-12.
 */
public class Leet_72 {
    public int minDistance(String word1,String word2){
        int m = word1.length();
        int n = word2.length();
        if(m==0||n==0)
            return Math.max(m,n);
        int result [][] = new int[m][n];
        boolean flag = false;
        flag = word1.charAt(0)==word2.charAt(0);
        if(flag)
            result[0][0]=0;
        else
            result[0][0]=1;
        for(int i=1;i<m;i++){
            if(!flag){
                flag = word1.charAt(i)==word2.charAt(0);
                result[i][0]=result[i-1][0]+(flag?0:1);
            }
            else{
                result[i][0]=result[i-1][0]+1;
            }
        }
        flag = word1.charAt(0)==word2.charAt(0);
        for(int i=1;i<n;i++){
            if(!flag){
                flag = word1.charAt(0)==word2.charAt(i);
                result[0][i]=result[0][i-1]+(flag?0:1);
            }
            else{
                result[0][i]=result[0][i-1]+1;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int up = result[i-1][j]+1;
                int left = result[i][j-1]+1;
                int replace = result[i-1][j-1]+(word1.charAt(i)==word2.charAt(j)?0:1);
                result[i][j]=Math.min(replace,up>left?left:up);
            }
        }
        return result[m-1][n-1];
    }
    public static void main(String args[]){
        System.out.println(new Leet_72().minDistance("faast", "fast"));
    }
}
