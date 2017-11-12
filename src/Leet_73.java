import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by tracysaber on 2017-11-12.
 */
public class Leet_73 {
    public void setZeroes(int [][]matrix){
        Set<Integer> rows= new HashSet<Integer>();
        Set<Integer> cols= new HashSet<Integer>();
        int m =matrix.length;
        if(m==0)
            return;
        else{
            int n=matrix[0].length;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==0){
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }
            for(Iterator<Integer> it = rows.iterator();it.hasNext();){
                int num = it.next();
                for(int i=0;i<n;i++){
                    matrix[num][i]=0;
                }
            }
            for(Iterator<Integer> it = cols.iterator();it.hasNext();){
                int num = it.next();
                for(int i=0;i<m;i++){
                    matrix[i][num]=0;
                }
            }
        }
    }
    public static void main(String args[]){
        int [][]m ={{1,2,3},{4,0,6},{7,8,9}};
        new Leet_73().setZeroes(m);
    }
}
