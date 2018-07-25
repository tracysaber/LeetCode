/**
 * Created by tracysaber on 2018-7-21.
 */
public class A_test {
    void guibing(ListNode a ,ListNode b){
        ListNode it1 = a.val>b.val?b:a;
        while(it1!=null){

        }
    }
    public static void main(String args[]){
        int nums[]={1,-2,4,8,-4,7,-1,-5};
        int result[] = new int[nums.length];
        result[0]=nums[0];
        int max = result[0];
        for(int i=1;i<result.length;i++){
            if(result[i-1]>0)
                result[i] = result[i-1]+nums[i];
            else
                result[i]=nums[i];
            max = Math.max(result[i],max);
        }
        System.out.print(max);
        ListNode count = new ListNode(0);
        ListNode it =count;
        for(int i=0;i < 4;i++){
            ListNode a=new ListNode(i);
            it.next = a;
            it = a;
        }

    }
}
