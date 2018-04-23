
import java.util.*;
public class Main4 {
    public void getSolutions(int a[],int start,int end,int m,List<Integer> result){
        if(m==0||(start==end&&m<=a[start]))    {result.add(1);return;}
        for(int i=0;i<=a[start];i++){
            if(m-i>=0&&end>start){
                getSolutions(a,start+1,end,m-i,result);
            }
        }

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        int l[] =new int[n];
        int r[] =new int[n];
        int g[] =new int [n];
        for(int i=0;i<n;i++){
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
            g[i] = r[i]-l[i];
            m -= l[i];
        }
        List<Integer> a =new LinkedList<Integer>();
        new Main4().getSolutions(g,0,n-1,m, a);
        System.out.print(a.size());
    }
}
