
import java.util.*;
public class Main4 {
    public void printNow(String now,int n){
        if(n>0){
            for(int i=0;i<=9;i++){
                char add = (char) ('0'+i);
                if(now.length()==0&&i==0)   printNow(now,n-1);
                else printNow(now+add,n-1);

            }
        }
        else{
            System.out.println(now);
        }
    }
    public void Print(int [][]num){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                if(num[i][j]%3==0)  num[i][j]=0;
            }
        }
    }

    public static void main(String args[]){
        int [][]a ={{1,2,3},{4,5,6},{7,8,9}};
        new Main4().Print(a);
        System.out.println();
        //new Main4().printNow("",4);

    }
}
