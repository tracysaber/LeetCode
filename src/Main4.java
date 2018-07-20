
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
    public void all(String now,LinkedList<Integer> nums){
        if(nums.size()==0){
            System.out.println(now);
            return;
        }
        else {
            for (int i = 0; i < nums.size(); i++) {
                int n =nums.get(i);
                char a = (char)('0'+n);
                nums.remove(i);
                all(now +a, nums);
                nums.add(i, n);
            }
        }
    }
    public void Print(int n){

    }

    public static void main(String args[]){
        int [][]a ={{1,2,3},{4,5,6},{7,8,9}};
        LinkedList<Integer>  n=new LinkedList<Integer>();
        for(int i=0;i<5;i++){
            n.add(i+1);
        }
        new Main4().all("",n);
        System.out.println();


        //new Main4().printNow("",4);

    }
}
