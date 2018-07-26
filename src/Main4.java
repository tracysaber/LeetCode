
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
//        int [][]a ={{1,2,3},{4,5,6},{7,8,9}};
//        LinkedList<Integer>  n=new LinkedList<Integer>();
//        for(int i=0;i<5;i++){
//            n.add(i+1);
//        }
//        new Main4().all("",n);
//        System.out.println();
        int nums[]={1,2,3,0,0,1,2,0,5,0,6};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        nums[i]=nums[j];
                        nums[j]=0;
                        break;
                    }
                }
            }
        }
        String a = new String ("ddd");
        StringBuffer b = new StringBuffer(a);
        System.out.print(a.equals(b));
//        int index_0=0,index_not=nums.length-1;
//        while (index_0<=index_not){
//            while(nums[index_0]!=0)
//                index_0++;
//            while(nums[index_not]==0)
//                index_not--;
//            if(index_0<=index_not) {
//                nums[index_0] = nums[index_not];
//                nums[index_not] = 0;
//            }
//        }
        System.out.println();

        //new Main4().printNow("",4);

    }
}
