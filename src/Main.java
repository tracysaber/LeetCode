import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public void p(int n,int max,String now){
        System.out.println(now+n);
        for(int i = max;i<=n/2;i++){
            p(n-i,i,now+i+'+');
        }
    }
    public void Print(int n){
        p(n,1,"");
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        new Main().Print(8);

    }
}