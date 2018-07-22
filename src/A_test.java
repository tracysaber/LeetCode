/**
 * Created by tracysaber on 2018-7-21.
 */
public class A_test {
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
    }
}
