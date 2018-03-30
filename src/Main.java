import java.util.*;
public class Main{
    public void p(List<String> result,int max,int n){
        if(n==1)
        {
            for(int i=0;i<10;i++){
                System.out.println(i);
                result.add(String.valueOf(i));
            }
            p(result,max,++n);
        }
        else{
            if(n<max) {
                int length = result.size();
                for (int i = 0; i < 10; i++) {
                    for(int j=0;i<length;j++){
                        if(i!=0)
                            System.out.println(String.valueOf(i) + result.get(j));
                        result.add(String.valueOf(i) + result.get(j));
                    }
                }
                for (int i = 0; i < length; i++) {
                    result.remove(0);
                }
                p(result,max,++n);
            }
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //int m = scan.nextInt();
        new Main().p(new LinkedList<String>(),3,1);
        //System.out.println(result);
    }
}