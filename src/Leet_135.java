/**
 * Created by tracysaber on 2017-12-30.
 */
public class Leet_135 {
    public int candy(int []ratings){
        int len = ratings.length;
        if(len==0)  return 0;
        int base = 0 ,min =0 ,sum=0;
        for(int i=1;i<len;i++){
            if(ratings[i]>ratings[i-1]) base++;
            if(ratings[i]<ratings[i-1]) min = Math.min(min,--base);
            sum+=base;
        }
        sum+=(len*(1-min));
        return sum;
    }
    public static void main(String args[]){
        int a[]={1,-1,4,9};
        System.out.println(new Leet_135().candy(a));
    }
}
