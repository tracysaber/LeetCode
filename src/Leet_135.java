/**
 * Created by tracysaber on 2017-12-30.
 */
public class Leet_135 {
//    public int candy(int []ratings){
//        int len = ratings.length;
//        if(len==0)  return 0;
//        int base = 0 ,min =0 ,sum=0;
//        for(int i=1;i<len;i++){
//            if(ratings[i]>ratings[i-1]) base++;
//            if(ratings[i]<ratings[i-1]) min = Math.min(min,--base);
//            sum+=base;
//        }
//        sum+=(len*(1-min));
//        return sum;
//    }
    public int candy(int []ratings){
        int len = ratings.length;
        if(len==0) return 0;
        int childs [] = new int[len];
        childs[0]=1;
        for(int i=1;i<len;i++){
            if(ratings[i]>ratings[i-1]) childs[i]=childs[i-1]+1;
            else childs[i]=1;
        }
        int sum=childs[len-1];
        for(int i=len-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) {
                if(childs[i]<=childs[i+1])
                    childs[i]=childs[i+1]+1;
            }
            sum+=childs[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int a[]={4,2,3,4,1};
        System.out.println(new Leet_135().candy(a));
    }
}
